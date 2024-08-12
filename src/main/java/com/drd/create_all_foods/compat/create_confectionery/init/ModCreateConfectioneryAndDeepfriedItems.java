package com.drd.create_all_foods.compat.create_confectionery.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.compat.create_confectionery.util.ModCreateConfectioneryFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pyzpre.createdeepfried.item.europe.germany;
import pyzpre.createdeepfried.item.europe.uk;

import java.util.List;

public class ModCreateConfectioneryAndDeepfriedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Item> WHITE_CHOCOLATE_BERLINER = ITEMS.register("white_chocolate_filled_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> BLACK_CHOCOLATE_BERLINER = ITEMS.register("black_chocolate_filled_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.BLACK_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> RUBY_CHOCOLATE_BERLINER = ITEMS.register("ruby_chocolate_filled_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.RUBY_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> CARAMEL_BERLINER = ITEMS.register("caramel_filled_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.CARAMEL_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });
    public static final RegistryObject<Item> COATED_WHITE_CHOCOLATE_BERLINER = ITEMS.register("coated_white_chocolate_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.COATED_WHITE_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> COATED_BLACK_CHOCOLATE_BERLINER = ITEMS.register("coated_black_chocolate_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.COATED_BLACK_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> COATED_RUBY_CHOCOLATE_BERLINER = ITEMS.register("coated_ruby_chocolate_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.COATED_RUBY_CHOCOLATE_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });
    public static final RegistryObject<Item> COATED_CARAMEL_BERLINER = ITEMS.register("coated_caramel_berliner",
            () -> new germany(new Item.Properties().food(ModCreateConfectioneryFoods.COATED_CARAMEL_BERLINER)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Speed (0:10)"));
                }
            });
    public static final RegistryObject<Item> DEEPFRIED_WHITE_CHOCOLATE_BAR = ITEMS.register("deepfried_white_chocolate_bar",
            () -> new uk(new Item.Properties().food(ModCreateConfectioneryFoods.DEEPFRIED_WHITE_CHOCOLATE_BAR)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Rest (0:30)"));
                }
            });
    public static final RegistryObject<Item> DEEPFRIED_BLACK_CHOCOLATE_BAR = ITEMS.register("deepfried_black_chocolate_bar",
            () -> new uk(new Item.Properties().food(ModCreateConfectioneryFoods.DEEPFRIED_BLACK_CHOCOLATE_BAR)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Stimulation (0:06)"));
                }
            });
    public static final RegistryObject<Item> DEEPFRIED_RUBY_CHOCOLATE_BAR = ITEMS.register("deepfried_ruby_chocolate_bar",
            () -> new uk(new Item.Properties().food(ModCreateConfectioneryFoods.DEEPFRIED_RUBY_CHOCOLATE_BAR)) {
                public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
                    super.appendHoverText(itemstack, world, list, flag);
                    list.add(Component.literal("§9Saturation (0:02)"));
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
