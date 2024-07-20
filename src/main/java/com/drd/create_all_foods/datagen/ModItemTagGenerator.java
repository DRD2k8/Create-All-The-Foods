package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.datagen.tag.ModItemTags;
import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CreateAllTheFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .addTag(ModItemTags.CINNAMON_LOGS);

        this.tag(ModItemTags.CINNAMON_LOGS)
                .add(ModBlocks.CINNAMON_LOG.get().asItem())
                .add(ModBlocks.CINNAMON_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CINNAMON_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CINNAMON_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.CINNAMON_PLANKS.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.CINNAMON_LEAVES.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(ModBlocks.CINNAMON_SAPLING.get().asItem());
    }
}
