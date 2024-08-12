package com.drd.create_all_foods.compat.create_confectionery.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.compat.create_confectionery.util.ModCreateConfectioneryFoods;
import createbicyclesbitterballen.item.ChocolateGlazedStroopwafelItem;
import createbicyclesbitterballen.item.WrappedChurrosItem;
import createbicyclesbitterballen.item.WrappedCoatedStroopwafelItem;
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

public class ModCreateConfectioneryAndBitterballenItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("white_chocolate_glazed_stroopwafel",
            () -> new ChocolateGlazedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("black_chocolate_glazed_stroopwafel",
            () -> new ChocolateGlazedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("ruby_chocolate_glazed_stroopwafel",
            () -> new ChocolateGlazedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> CARAMEL_GLAZED_STROOPWAFEL = ITEMS.register("caramel_glazed_stroopwafel",
            () -> new ChocolateGlazedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.CARAMEL_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_WHITE_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("wrapped_white_chocolate_glazed_stroopwafel",
            () -> new WrappedCoatedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_BLACK_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("wrapped_black_chocolate_glazed_stroopwafel",
            () -> new WrappedCoatedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_RUBY_CHOCOLATE_GLAZED_STROOPWAFEL = ITEMS.register("wrapped_ruby_chocolate_glazed_stroopwafel",
            () -> new WrappedCoatedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_CARAMEL_GLAZED_STROOPWAFEL = ITEMS.register("wrapped_caramel_glazed_stroopwafel",
            () -> new WrappedCoatedStroopwafelItem(new Item.Properties().food(ModCreateConfectioneryFoods.CARAMEL_GLAZED_STROOPWAFEL)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("white_chocolate_glazed_churros",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> BLACK_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("black_chocolate_glazed_churros",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> RUBY_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("ruby_chocolate_glazed_churros",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> CARAMEL_GLAZED_CHURROS = ITEMS.register("caramel_glazed_churros",
            () -> new Item(new Item.Properties().food(ModCreateConfectioneryFoods.CARAMEL_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_WHITE_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("wrapped_white_chocolate_glazed_churros",
            () -> new WrappedChurrosItem(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_BLACK_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("wrapped_black_chocolate_glazed_churros",
            () -> new WrappedChurrosItem(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_RUBY_CHOCOLATE_GLAZED_CHURROS = ITEMS.register("wrapped_ruby_chocolate_glazed_churros",
            () -> new WrappedChurrosItem(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> WRAPPED_CARAMEL_GLAZED_CHURROS = ITEMS.register("wrapped_caramel_glazed_churros",
            () -> new WrappedChurrosItem(new Item.Properties().food(ModCreateConfectioneryFoods.CARAMEL_GLAZED_CHURROS)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
