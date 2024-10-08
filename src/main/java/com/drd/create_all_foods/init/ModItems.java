package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.entity.CustomBoat;
import com.drd.create_all_foods.item.*;
import com.drd.create_all_foods.util.ModFoods;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> FLATTENED_DOUGH = ITEMS.register("flattened_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKIE = ITEMS.register("cookie",
            () -> new Item(new Item.Properties().food(Foods.COOKIE)));
    public static final RegistryObject<Item> CHOCOLATE_CHIP = ITEMS.register("chocolate_chip",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_CHIP)));
    public static final RegistryObject<Item> GRAHAM_CRACKER = ITEMS.register("graham_cracker",
            () -> new Item(new Item.Properties().food(Foods.COOKIE)));
    public static final RegistryObject<Item> ROASTED_MARSHMALLOW = ITEMS.register("roasted_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.ROASTED_MARSHMALLOW)));
    public static final RegistryObject<Item> ROASTED_MARSHMALLOW_ON_A_STICK = ITEMS.register("roasted_marshmallow_on_a_stick",
            () -> new Item(new Item.Properties().food(ModFoods.ROASTED_MARSHMALLOW_ON_A_STICK)));
    public static final RegistryObject<Item> INCOMPLETE_CHOCOLATE_SMORE = ITEMS.register("incomplete_chocolate_smore",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> CHOCOLATE_SMORE = ITEMS.register("chocolate_smore",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_SMORE)));
    public static final RegistryObject<Item> PEANUT_BUTTER_ROLL = ITEMS.register("peanut_butter_roll",
            () -> new Item(new Item.Properties().food(ModFoods.PEANUT_BUTTER_BREAD)));
    public static final RegistryObject<Item> PEANUT_BUTTER_APPLE = ITEMS.register("peanut_butter_apple",
            () -> new Item(new Item.Properties().food(ModFoods.PEANUT_BUTTER_APPLE)));
    public static final RegistryObject<Item> PEANUT_BUTTER_WAFFLE = ITEMS.register("peanut_butter_waffle",
            () -> new Item(new Item.Properties().food(ModFoods.PEANUT_BUTTER_WAFFLE)));

    public static final RegistryObject<Item> PEANUT_BUTTER_BUCKET = ITEMS.register("peanut_butter_bucket",
            () -> new BucketItem(ModFluids.PEANUT_BUTTER,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> CINNAMON_SIGN = ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));
    public static final RegistryObject<Item> CINNAMON_HANGING_SIGN = ITEMS.register("cinnamon_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CINNAMON_HANGING_SIGN.get(), ModBlocks.CINNAMON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CINNAMON_BOAT = ITEMS.register("cinnamon_boat",
            () -> new CustomBoatItem(false, CustomBoat.Type.CINNAMON, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CINNAMON_CHEST_BOAT = ITEMS.register("cinnamon_chest_boat",
            () -> new CustomBoatItem(true, CustomBoat.Type.CINNAMON, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
