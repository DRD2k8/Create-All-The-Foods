package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.datagen.tag.ModItemTags;
import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public ModRecipeGenerator(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_PLANKS.get(), 4)
                .requires(ModItemTags.CINNAMON_LOGS)
                .unlockedBy(getHasName(ModBlocks.CINNAMON_LOG.get()), has(ModItemTags.CINNAMON_LOGS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.CINNAMON_LOG.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_LOG.get()), has(ModBlocks.CINNAMON_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CINNAMON_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.STRIPPED_CINNAMON_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CINNAMON_LOG.get()), has(ModBlocks.STRIPPED_CINNAMON_LOG.get()))
                .save(consumer);
    }
}
