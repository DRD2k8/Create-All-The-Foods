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

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.CINNAMON_STAIRS.get());

        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.CINNAMON_SLAB.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.CINNAMON_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.CINNAMON_FENCE_GATE.get());

        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.CINNAMON_DOOR.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CINNAMON_TRAPDOOR.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CINNAMON_PRESSURE_PLATE.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.CINNAMON_BUTTON.get());
    }
}
