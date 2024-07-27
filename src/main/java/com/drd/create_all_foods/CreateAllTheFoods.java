package com.drd.create_all_foods;

import com.drd.create_all_foods.client.renderer.entity.CustomBoatRenderer;
import com.drd.create_all_foods.datagen.*;
import com.drd.create_all_foods.init.*;
import com.drd.create_all_foods.util.ModWoodTypes;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.concurrent.CompletableFuture;

@Mod(CreateAllTheFoods.MOD_ID)
public class CreateAllTheFoods {
    public static final String MOD_ID = "create_all_foods";

    public CreateAllTheFoods() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_SAPLING.get(), RenderType.cutoutMipped());

            Sheets.addWoodType(ModWoodTypes.CINNAMON);

            EntityRenderers.register(ModEntities.BOAT.get(), pContext -> new CustomBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.CHEST_BOAT.get(), pContext -> new CustomBoatRenderer(pContext, true));
        }

        @SubscribeEvent
        public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
            event.getItemColors().register((stack, tintIndex) -> {
                        BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return event.getBlockColors().getColor(state, null, null, tintIndex); },
                    ModBlocks.CINNAMON_LEAVES.get());
        }

        @SubscribeEvent
        public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
            event.getBlockColors().register((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.CINNAMON_LEAVES.get());
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class DataGenerators {
        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            DataGenerator generator = event.getGenerator();
            PackOutput packOutput = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            generator.addProvider(event.includeClient(), new ModBlockStateGenerator(packOutput, existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelGenerator(packOutput, existingFileHelper));

            generator.addProvider(event.includeServer(), new ModRecipeGenerator(packOutput));
            generator.addProvider(event.includeServer(), ModLootTableGenerator.create(packOutput));
            generator.addProvider(event.includeServer(), new ModWorldGenerator(packOutput, lookupProvider));
            generator.addProvider(event.includeServer(), new ModBiomeTagGenerator(packOutput, lookupProvider, existingFileHelper));

            ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                    new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
            generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
        }
    }
}
