package com.drd.create_all_foods.datagen.loot;

import com.drd.create_all_foods.init.ModBlocks;
import com.drd.create_all_foods.init.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
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
        this.dropSelf(ModBlocks.CINNAMON_STAIRS.get());
        this.dropSelf(ModBlocks.CINNAMON_FENCE.get());
        this.dropSelf(ModBlocks.CINNAMON_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CINNAMON_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CINNAMON_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CINNAMON_BUTTON.get());
        this.add(ModBlocks.CINNAMON_SLAB.get(), block ->
                createSlabItemTable(ModBlocks.CINNAMON_SLAB.get()));
        this.add(ModBlocks.CINNAMON_DOOR.get(), block ->
                createDoorTable(ModBlocks.CINNAMON_DOOR.get()));
        this.add(ModBlocks.CINNAMON_SIGN.get(), block ->
                createSingleItemTable(ModItems.CINNAMON_SIGN.get()));
        this.add(ModBlocks.CINNAMON_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CINNAMON_SIGN.get()));
        this.add(ModBlocks.CINNAMON_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CINNAMON_HANGING_SIGN.get()));
        this.add(ModBlocks.CINNAMON_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CINNAMON_HANGING_SIGN.get()));
        this.add(ModBlocks.CINNAMON_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CINNAMON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.CINNAMON_SAPLING.get());

        // These loot tables are required by datagen for some reason
        this.dropOther(ModBlocks.PEANUT_BUTTER.get(), Items.AIR);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
