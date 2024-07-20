package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateGenerator extends BlockStateProvider {
    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CreateAllTheFoods.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.CINNAMON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CINNAMON_WOOD.get()), blockTexture(ModBlocks.CINNAMON_LOG.get()), blockTexture(ModBlocks.CINNAMON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CINNAMON_LOG.get()), blockTexture(ModBlocks.STRIPPED_CINNAMON_LOG.get()),
                new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/stripped_cinnamon_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CINNAMON_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CINNAMON_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CINNAMON_LOG.get()));
        blockWithItem(ModBlocks.CINNAMON_PLANKS);
        leavesBlock(ModBlocks.CINNAMON_LEAVES);
        saplingBlock(ModBlocks.CINNAMON_SAPLING);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
