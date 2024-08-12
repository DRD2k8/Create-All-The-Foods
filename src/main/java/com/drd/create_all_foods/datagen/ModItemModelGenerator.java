package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryAndBitterballenItems;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryAndDeepfriedItems;
import com.drd.create_all_foods.compat.create_confectionery.init.ModCreateConfectioneryItems;
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
        simpleItem(ModCreateConfectioneryItems.WHITE_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModCreateConfectioneryItems.BLACK_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModCreateConfectioneryItems.RUBY_CHOCOLATE_CHIP_COOKIE);
        simpleItem(ModItems.CHOCOLATE_CHIP);
        simpleItem(ModCreateConfectioneryItems.WHITE_CHOCOLATE_CHIP);
        simpleItem(ModCreateConfectioneryItems.BLACK_CHOCOLATE_CHIP);
        simpleItem(ModCreateConfectioneryItems.RUBY_CHOCOLATE_CHIP);
        simpleItem(ModItems.GRAHAM_CRACKER);
        simpleItem(ModItems.ROASTED_MARSHMALLOW);
        simpleItem(ModItems.ROASTED_MARSHMALLOW_ON_A_STICK);
        simpleItem(ModItems.INCOMPLETE_CHOCOLATE_SMORE);
        simpleItem(ModItems.CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.INCOMPLETE_WHITE_CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.WHITE_CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.INCOMPLETE_BLACK_CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.BLACK_CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.INCOMPLETE_RUBY_CHOCOLATE_SMORE);
        simpleItem(ModCreateConfectioneryItems.RUBY_CHOCOLATE_SMORE);
        evenSimplerBlockItem(ModBlocks.CAKE);
        simpleItem(ModCreateConfectioneryItems.WHITE_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModCreateConfectioneryItems.BLACK_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModCreateConfectioneryItems.RUBY_CHOCOLATE_GLAZED_NUT_MIX);
        simpleItem(ModCreateConfectioneryItems.CARAMEL_GLAZED_NUT_MIX);
        simpleItem(ModItems.PEANUT_BUTTER_ROLL);
        simpleItem(ModItems.PEANUT_BUTTER_APPLE);
        simpleItem(ModItems.PEANUT_BUTTER_WAFFLE);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WHITE_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.BLACK_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.RUBY_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.CARAMEL_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_WHITE_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_BLACK_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_RUBY_CHOCOLATE_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_CARAMEL_GLAZED_STROOPWAFEL);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WHITE_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.BLACK_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.RUBY_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.CARAMEL_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_WHITE_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_BLACK_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_RUBY_CHOCOLATE_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndBitterballenItems.WRAPPED_CARAMEL_GLAZED_CHURROS);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.WHITE_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.BLACK_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.RUBY_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.CARAMEL_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.COATED_WHITE_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.COATED_BLACK_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.COATED_RUBY_CHOCOLATE_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.COATED_CARAMEL_BERLINER);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_WHITE_CHOCOLATE_BAR);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_BLACK_CHOCOLATE_BAR);
        simpleItem(ModCreateConfectioneryAndDeepfriedItems.DEEPFRIED_RUBY_CHOCOLATE_BAR);
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
