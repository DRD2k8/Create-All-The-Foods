package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.init.ModBlocks;
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
        simpleBlockItem(ModBlocks.CINNAMON_LOG);
        simpleBlockItem(ModBlocks.CINNAMON_WOOD);
        simpleBlockItem(ModBlocks.STRIPPED_CINNAMON_LOG);
        simpleBlockItem(ModBlocks.STRIPPED_CINNAMON_WOOD);
        simpleBlockItem(ModBlocks.CINNAMON_LEAVES);
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
}
