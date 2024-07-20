package com.drd.create_all_foods.datagen.tag;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> CINNAMON_LOGS = tag(CreateAllTheFoods.MOD_ID, "cinnamon_logs");

    private static TagKey<Block> tag(String modid, String name) {
        return BlockTags.create(new ResourceLocation(modid, name));
    }
}
