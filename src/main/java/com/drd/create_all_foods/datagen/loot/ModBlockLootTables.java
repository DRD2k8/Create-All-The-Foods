package com.drd.create_all_foods.datagen.loot;

import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CINNAMON_LOG.get());
        this.dropSelf(ModBlocks.CINNAMON_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CINNAMON_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CINNAMON_WOOD.get());
        this.dropSelf(ModBlocks.CINNAMON_PLANKS.get());
        this.add(ModBlocks.CINNAMON_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CINNAMON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.CINNAMON_SAPLING.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
