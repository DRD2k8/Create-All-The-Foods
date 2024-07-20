package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.datagen.tag.ModItemTags;
import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_FENCE.get(), 3)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Tags.Items.RODS_WOODEN))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_FENCE_GATE.get())
                .pattern("X#X")
                .pattern("X#X")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Tags.Items.RODS_WOODEN))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_TRAPDOOR.get())
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNAMON_BUTTON.get())
                .requires(ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);
    }
}
