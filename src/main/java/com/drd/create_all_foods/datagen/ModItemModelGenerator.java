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
        simpleItem(ModItems.FLATTENED_DOUGH);
        simpleItem(ModItems.COOKIE);
        simpleItem(ModItems.WHITE_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModItems.BLACK_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModItems.RUBY_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModItems.CHOCOLATE_CHIP);
        simpleItem(ModItems.WHITE_CHOCOLATE_CHIP);
        simpleItem(ModItems.BLACK_CHOCOLATE_CHIP);
        simpleItem(ModItems.RUBY_CHOCOLATE_CHIP);
        simpleItem(ModItems.GRAHAM_CRACKER);
        simpleItem(ModItems.ROASTED_MARSHMALLOW);
        simpleItem(ModItems.ROASTED_MARSHMALLOW_ON_A_STICK);
        simpleItem(ModItems.INCOMPLETE_CHOCOLATE_SMORE);
        simpleItem(ModItems.CHOCOLATE_SMORE);
        simpleItem(ModItems.INCOMPLETE_WHITE_CHOCOLATE_SMORE);
        simpleItem(ModItems.WHITE_CHOCOLATE_SMORE);
        simpleItem(ModItems.INCOMPLETE_BLACK_CHOCOLATE_SMORE);
        simpleItem(ModItems.BLACK_CHOCOLATE_SMORE);
        simpleItem(ModItems.INCOMPLETE_RUBY_CHOCOLATE_SMORE);
        simpleItem(ModItems.RUBY_CHOCOLATE_SMORE);
        evenSimplerBlockItem(ModBlocks.CAKE);
        simpleItem(ModItems.WHITE_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModItems.BLACK_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModItems.RUBY_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModItems.CARAMEL_GLAZED_NUT_MIX);
        simpleItem(ModItems.PEANUT_BUTTER_ROLL);
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
        simpleItem(ModItems.CINNAMON_BOAT);
        simpleItem(ModItems.CINNAMON_CHEST_BOAT);
        simplerBlockItem(ModBlocks.CINNAMON_SAPLING);
        simpleItem(ModItems.PEANUT_BUTTER_BUCKET);
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

    private ItemModelBuilder evenSimplerBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateAllTheFoods.MOD_ID,"item/" + item.getId().getPath()));
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
