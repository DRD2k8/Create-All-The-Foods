package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.simibubi.create.AllItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AllItems.SWEET_ROLL.get()))
                    .title(Component.translatable("itemGroup.create_all_foods"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CINNAMON.get());
                        pOutput.accept(ModItems.RAW_PLAIN_ROLL.get());
                        pOutput.accept(ModItems.PLAIN_ROLL.get());
                        pOutput.accept(ModItems.CINNAMON_ROLL.get());
                        pOutput.accept(ModItems.FLATTENED_DOUGH.get());
                        pOutput.accept(ModItems.COOKIE.get());
                        pOutput.accept(ModItems.WHITE_CHOCOLATE_CHIP_COOKIE.get());
                        pOutput.accept(ModItems.BLACK_CHOCOLATE_CHIP_COOKIE.get());
                        pOutput.accept(ModItems.RUBY_CHOCOLATE_CHIP_COOKIE.get());
                        pOutput.accept(ModItems.CHOCOLATE_CHIP.get());
                        pOutput.accept(ModItems.WHITE_CHOCOLATE_CHIP.get());
                        pOutput.accept(ModItems.BLACK_CHOCOLATE_CHIP.get());
                        pOutput.accept(ModItems.RUBY_CHOCOLATE_CHIP.get());
                        pOutput.accept(ModItems.GRAHAM_CRACKER.get());
                        pOutput.accept(ModItems.ROASTED_MARSHMALLOW.get());
                        pOutput.accept(ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get());
                        pOutput.accept(ModItems.CHOCOLATE_SMORE.get());
                        pOutput.accept(ModItems.WHITE_CHOCOLATE_SMORE.get());
                        pOutput.accept(ModItems.BLACK_CHOCOLATE_SMORE.get());
                        pOutput.accept(ModItems.RUBY_CHOCOLATE_SMORE.get());
                        pOutput.accept(ModItems.PEANUT_BUTTER_BUCKET.get());
                        pOutput.accept(ModBlocks.CINNAMON_LOG.get());
                        pOutput.accept(ModBlocks.CINNAMON_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CINNAMON_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CINNAMON_WOOD.get());
                        pOutput.accept(ModBlocks.CINNAMON_PLANKS.get());
                        pOutput.accept(ModBlocks.CINNAMON_STAIRS.get());
                        pOutput.accept(ModBlocks.CINNAMON_SLAB.get());
                        pOutput.accept(ModBlocks.CINNAMON_FENCE.get());
                        pOutput.accept(ModBlocks.CINNAMON_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CINNAMON_DOOR.get());
                        pOutput.accept(ModBlocks.CINNAMON_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CINNAMON_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CINNAMON_BUTTON.get());
                        pOutput.accept(ModItems.CINNAMON_SIGN.get());
                        pOutput.accept(ModItems.CINNAMON_HANGING_SIGN.get());
                        pOutput.accept(ModItems.CINNAMON_BOAT.get());
                        pOutput.accept(ModItems.CINNAMON_CHEST_BOAT.get());
                        pOutput.accept(ModBlocks.CINNAMON_LEAVES.get());
                        pOutput.accept(ModBlocks.CINNAMON_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
