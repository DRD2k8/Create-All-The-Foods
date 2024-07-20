package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.init.ModBlocks;
import com.drd.create_all_foods.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateAllTheFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CINNAMON);
        simpleItem(ModItems.PLAIN_ROLL);
        simpleItem(ModItems.RAW_PLAIN_ROLL);
        simpleItem(ModItems.CINNAMON_ROLL);
        simpleBlockItem(ModBlocks.CINNAMON_LOG);
        simpleBlockItem(ModBlocks.CINNAMON_WOOD);
        simpleBlockItem(ModBlocks.STRIPPED_CINNAMON_LOG);
        simpleBlockItem(ModBlocks.STRIPPED_CINNAMON_WOOD);
        simpleBlockItem(ModBlocks.CINNAMON_LEAVES);
        simpleBlockItem(ModBlocks.CINNAMON_STAIRS);
        simpleBlockItem(ModBlocks.CINNAMON_SLAB);
        blockWithInventoryItem(ModBlocks.CINNAMON_FENCE);
        simpleBlockItem(ModBlocks.CINNAMON_FENCE_GATE);
        trapdoorItem(ModBlocks.CINNAMON_TRAPDOOR);
        simpleBlockItem(ModBlocks.CINNAMON_PRESSURE_PLATE);
        blockWithInventoryItem(ModBlocks.CINNAMON_BUTTON);
        simpleItem(ModItems.CINNAMON_SIGN);
        simpleItem(ModItems.CINNAMON_HANGING_SIGN);
        simplerBlockItem(ModBlocks.CINNAMON_SAPLING);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateAllTheFoods.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> blockItem) {
        return withExistingParent(blockItem.getId().getPath(),
                new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/" + blockItem.getId().getPath()));
    }

    private ItemModelBuilder simplerBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateAllTheFoods.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder blockWithInventoryItem(RegistryObject<Block> blockItem) {
        return withExistingParent(blockItem.getId().getPath(),
                new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/" + blockItem.getId().getPath() + "_inventory"));
    }

    private ItemModelBuilder trapdoorItem(RegistryObject<Block> blockItem) {
        return withExistingParent(blockItem.getId().getPath(),
                new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/" + blockItem.getId().getPath() + "_bottom"));
    }
}
