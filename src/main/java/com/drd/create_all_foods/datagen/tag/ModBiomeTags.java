package com.drd.create_all_foods.datagen.tag;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> IS_CINNAMON_TREE_SPAWNABLE_ON = tag(CreateAllTheFoods.MOD_ID, "is_cinnamon_tree_spawnable_on");

    private static TagKey<Biome> tag(String modid, String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(modid, name));
    }
}
