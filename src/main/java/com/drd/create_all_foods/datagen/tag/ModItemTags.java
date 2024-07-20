package com.drd.create_all_foods.datagen.tag;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> CINNAMON_LOGS = tag(CreateAllTheFoods.MOD_ID, "cinnamon_logs");
    public static final TagKey<Item> CINNAMON = tag("forge", "cinnamon");

    private static TagKey<Item> tag(String modid, String name) {
        return ItemTags.create(new ResourceLocation(modid, name));
    }
}
