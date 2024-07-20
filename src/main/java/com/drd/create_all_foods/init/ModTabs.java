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
                        pOutput.accept(ModBlocks.CINNAMON_LOG.get());
                        pOutput.accept(ModBlocks.CINNAMON_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CINNAMON_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CINNAMON_WOOD.get());
                        pOutput.accept(ModBlocks.CINNAMON_PLANKS.get());
                        pOutput.accept(ModBlocks.CINNAMON_LEAVES.get());
                        pOutput.accept(ModBlocks.CINNAMON_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
