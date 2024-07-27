package com.drd.create_all_foods.datagen.tag;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> CINNAMON_LOGS = tag(CreateAllTheFoods.MOD_ID, "cinnamon_logs");
    public static final TagKey<Item> CINNAMON = tag("forge", "cinnamon");
    public static final TagKey<Item> NUTS = tag("garnished", "nuts");
    public static final TagKey<Item> NUT_MIXES = tag("garnished", "nut_mix");
    public static final TagKey<Item> WHITE_CHOCOLATE_GLAZED_NUTS = tag(CreateAllTheFoods.MOD_ID, "white_chocolate_glazed_nuts");
    public static final TagKey<Item> BLACK_CHOCOLATE_GLAZED_NUTS = tag(CreateAllTheFoods.MOD_ID, "black_chocolate_glazed_nuts");
    public static final TagKey<Item> RUBY_CHOCOLATE_GLAZED_NUTS = tag(CreateAllTheFoods.MOD_ID, "ruby_chocolate_glazed_nuts");
    public static final TagKey<Item> CARAMEL_GLAZED_NUTS = tag(CreateAllTheFoods.MOD_ID, "caramel_glazed_nuts");
    public static final TagKey<Item> GARNISHED_BERRIES = tag("garnished", "berries");

    private static TagKey<Item> tag(String modid, String name) {
        return ItemTags.create(new ResourceLocation(modid, name));
    }
}
