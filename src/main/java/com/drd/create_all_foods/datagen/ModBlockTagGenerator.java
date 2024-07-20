package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.datagen.tag.ModBlockTags;
import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateAllTheFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ModBlockTags.CINNAMON_LOGS);

        this.tag(ModBlockTags.CINNAMON_LOGS)
                .add(ModBlocks.CINNAMON_LOG.get())
                .add(ModBlocks.CINNAMON_WOOD.get())
                .add(ModBlocks.STRIPPED_CINNAMON_LOG.get())
                .add(ModBlocks.STRIPPED_CINNAMON_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.CINNAMON_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.CINNAMON_LEAVES.get());

        this.tag(BlockTags.SAPLINGS)
                .add(ModBlocks.CINNAMON_SAPLING.get());
    }
}
