package com.drd.create_all_foods.compat.create_confectionery.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.compat.create_confectionery.util.ModCreateConfectioneryFoods;
import com.drd.create_all_foods.item.*;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModCreateConfectioneryItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Item> WHITE_CHOCOLATE_CHIP_COOKIE = ITEMS.register("white_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_CHIP_COOKIE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> BLACK_CHOCOLATE_CHIP_COOKIE = ITEMS.register("black_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_CHIP_COOKIE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> RUBY_CHOCOLATE_CHIP_COOKIE = ITEMS.register("ruby_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_CHIP_COOKIE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> WHITE_CHOCOLATE_CHIP = ITEMS.register("white_chocolate_chip",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_CHIP)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> BLACK_CHOCOLATE_CHIP = ITEMS.register("black_chocolate_chip",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_CHIP)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> RUBY_CHOCOLATE_CHIP = ITEMS.register("ruby_chocolate_chip",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_CHIP)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> INCOMPLETE_WHITE_CHOCOLATE_SMORE = ITEMS.register("incomplete_white_chocolate_smore",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_SMORE = ITEMS.register("white_chocolate_smore",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_SMORE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> INCOMPLETE_BLACK_CHOCOLATE_SMORE = ITEMS.register("incomplete_black_chocolate_smore",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_SMORE = ITEMS.register("black_chocolate_smore",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_SMORE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> INCOMPLETE_RUBY_CHOCOLATE_SMORE = ITEMS.register("incomplete_ruby_chocolate_smore",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_SMORE = ITEMS.register("ruby_chocolate_smore",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_SMORE)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_CASHEW = ITEMS.register("white_chocolate_glazed_cashew",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_WALNUT = ITEMS.register("white_chocolate_glazed_walnut",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_ALMOND = ITEMS.register("white_chocolate_glazed_almond",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_PECAN = ITEMS.register("white_chocolate_glazed_pecan",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_PISTACHIO = ITEMS.register("white_chocolate_glazed_pistachio",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_MACADAMIA = ITEMS.register("white_chocolate_glazed_macadamia",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_HAZELNUT = ITEMS.register("white_chocolate_glazed_hazelnut",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_PEANUT = ITEMS.register("white_chocolate_glazed_peanut",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_CHESTNUT = ITEMS.register("white_chocolate_glazed_chestnut",
            () -> new WhiteChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_NUT_MIX = ITEMS.register("white_chocolate_glazed_nut_mix",
            () -> new WhiteChocolateGlazedNutMixFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_CASHEW = ITEMS.register("black_chocolate_glazed_cashew",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_WALNUT = ITEMS.register("black_chocolate_glazed_walnut",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_ALMOND = ITEMS.register("black_chocolate_glazed_almond",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_PECAN = ITEMS.register("black_chocolate_glazed_pecan",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_PISTACHIO = ITEMS.register("black_chocolate_glazed_pistachio",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_MACADAMIA = ITEMS.register("black_chocolate_glazed_macadamia",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_HAZELNUT = ITEMS.register("black_chocolate_glazed_hazelnut",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_PEANUT = ITEMS.register("black_chocolate_glazed_peanut",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_CHESTNUT = ITEMS.register("black_chocolate_glazed_chestnut",
            () -> new BlackChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_NUT_MIX = ITEMS.register("black_chocolate_glazed_nut_mix",
            () -> new BlackChocolateGlazedNutMixFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_CASHEW = ITEMS.register("ruby_chocolate_glazed_cashew",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_WALNUT = ITEMS.register("ruby_chocolate_glazed_walnut",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_ALMOND = ITEMS.register("ruby_chocolate_glazed_almond",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_PECAN = ITEMS.register("ruby_chocolate_glazed_pecan",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_PISTACHIO = ITEMS.register("ruby_chocolate_glazed_pistachio",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_MACADAMIA = ITEMS.register("ruby_chocolate_glazed_macadamia",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_HAZELNUT = ITEMS.register("ruby_chocolate_glazed_hazelnut",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_PEANUT = ITEMS.register("ruby_chocolate_glazed_peanut",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_CHESTNUT = ITEMS.register("ruby_chocolate_glazed_chestnut",
            () -> new RubyChocolateGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_NUT_MIX = ITEMS.register("ruby_chocolate_glazed_nut_mix",
            () -> new RubyChocolateGlazedNutMixFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_CASHEW = ITEMS.register("caramel_glazed_cashew",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_WALNUT = ITEMS.register("caramel_glazed_walnut",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_ALMOND = ITEMS.register("caramel_glazed_almond",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_PECAN = ITEMS.register("caramel_glazed_pecan",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_PISTACHIO = ITEMS.register("caramel_glazed_pistachio",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_MACADAMIA = ITEMS.register("caramel_glazed_macadamia",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_HAZELNUT = ITEMS.register("caramel_glazed_hazelnut",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_PEANUT = ITEMS.register("caramel_glazed_peanut",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_CHESTNUT = ITEMS.register("caramel_glazed_chestnut",
            () -> new CaramelGlazedNutFoodItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_GLAZED_NUT_MIX = ITEMS.register("caramel_glazed_nut_mix",
            () -> new CaramelGlazedNutMixFoodItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
