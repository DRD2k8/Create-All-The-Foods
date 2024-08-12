package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryAndBitterballenItems;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryAndDeepfriedItems;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryItems;
import com.drd.create_all_foods.util.ModInfoUtils;
import com.simibubi.create.AllItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResultHolder;
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
                        if (ModInfoUtils.isModLoaded("create_confectionery")) {
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_CHIP_COOKIE.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_CHIP_COOKIE.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_CHIP_COOKIE.get());
                        }
                        pOutput.accept(ModItems.CHOCOLATE_CHIP.get());
                        if (ModInfoUtils.isModLoaded("create_confectionery")) {
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_CHIP.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_CHIP.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_CHIP.get());
                        }
                        pOutput.accept(ModItems.GRAHAM_CRACKER.get());
                        pOutput.accept(ModItems.ROASTED_MARSHMALLOW.get());
                        pOutput.accept(ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get());
                        pOutput.accept(ModItems.CHOCOLATE_SMORE.get());
                        if (ModInfoUtils.isModLoaded("create_confectionery")) {
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_SMORE.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_SMORE.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_SMORE.get());
                        }
                        pOutput.accept(ModBlocks.CAKE.get());
                        if (ModInfoUtils.isModLoaded("create_confectionery")) {
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_CASHEW.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_CASHEW.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_CASHEW.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_CASHEW.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_WALNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_WALNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_WALNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_WALNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_ALMOND.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_ALMOND.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_ALMOND.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_ALMOND.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_PECAN.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_PECAN.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_PECAN.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_PECAN.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_PISTACHIO.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_PISTACHIO.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_PISTACHIO.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_PISTACHIO.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_MACADAMIA.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_MACADAMIA.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_MACADAMIA.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_MACADAMIA.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_HAZELNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_HAZELNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_HAZELNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_HAZELNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_PEANUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_PEANUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_PEANUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_PEANUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_CHESTNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_CHESTNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_CHESTNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_CHESTNUT.get());
                            pOutput.accept(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_NUT_MIX.get());
                            pOutput.accept(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_NUT_MIX.get());
                            pOutput.accept(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_NUT_MIX.get());
                            pOutput.accept(ModCreateConfectioneryItems.CARAMEL_GLAZED_NUT_MIX.get());
                        }
                        pOutput.accept(ModItems.PEANUT_BUTTER_ROLL.get());
                        pOutput.accept(ModItems.PEANUT_BUTTER_APPLE.get());
                        pOutput.accept(ModItems.PEANUT_BUTTER_WAFFLE.get());
                        pOutput.accept(ModItems.PEANUT_BUTTER_BUCKET.get());
                        if (ModInfoUtils.isModLoaded("create_confectionery")) {
                            if (ModInfoUtils.isModLoaded("create_bic_bit")) {
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WHITE_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.BLACK_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.RUBY_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.CARAMEL_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_WHITE_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_BLACK_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_RUBY_CHOCOLATE_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_CARAMEL_GLAZED_STROOPWAFEL.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WHITE_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.BLACK_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.RUBY_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.CARAMEL_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_WHITE_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_BLACK_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_RUBY_CHOCOLATE_GLAZED_CHURROS.get());
                                pOutput.accept(ModCreateConfectioneryAndBitterballenItems.WRAPPED_CARAMEL_GLAZED_CHURROS.get());
                            }
                            if (ModInfoUtils.isModLoaded("create_deepfried")) {
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.WHITE_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.BLACK_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.RUBY_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.CARAMEL_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.COATED_WHITE_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.COATED_BLACK_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.COATED_RUBY_CHOCOLATE_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.COATED_CARAMEL_BERLINER.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_WHITE_CHOCOLATE_BAR.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_BLACK_CHOCOLATE_BAR.get());
                                pOutput.accept(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_RUBY_CHOCOLATE_BAR.get());
                            }
                        }
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
