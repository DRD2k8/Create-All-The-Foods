package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.util.ModFoods;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Item> CINNAMON = ITEMS.register("cinnamon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLAIN_ROLL = ITEMS.register("raw_plain_roll",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_BREAD)));
    public static final RegistryObject<Item> PLAIN_ROLL = ITEMS.register("plain_roll",
            () -> new Item(new Item.Properties().food(Foods.BREAD)));
    public static final RegistryObject<Item> CINNAMON_ROLL = ITEMS.register("cinnamon_roll",
            () -> new Item(new Item.Properties().food(ModFoods.CINNAMON_BREAD)));

    public static final RegistryObject<Item> CINNAMON_SIGN = ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));
    public static final RegistryObject<Item> CINNAMON_HANGING_SIGN = ITEMS.register("cinnamon_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CINNAMON_HANGING_SIGN.get(), ModBlocks.CINNAMON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
