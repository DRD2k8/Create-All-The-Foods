package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.datagen.tag.ModItemTags;
import com.drd.create_all_foods.init.ModBlocks;
import com.drd.create_all_foods.init.ModItems;
import com.simibubi.create.AllItems;
import net.mcreator.createconfectionery.init.CreateConfectioneryModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CINNAMON_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Tags.Items.RODS_WOODEN))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CINNAMON_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.STRIPPED_CINNAMON_LOG.get())
                .define('X', Items.CHAIN)
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CINNAMON_LOG.get()), has(ModBlocks.STRIPPED_CINNAMON_LOG.get()))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CINNAMON_BOAT.get())
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.CINNAMON_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CINNAMON_PLANKS.get()), has(ModBlocks.CINNAMON_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNAMON_CHEST_BOAT.get())
                .requires(ModItems.CINNAMON_BOAT.get())
                .requires(Tags.Items.CHESTS_WOODEN)
                .unlockedBy(getHasName(ModItems.CINNAMON_BOAT.get()), has(ModItems.CINNAMON_BOAT.get()))
                .unlockedBy(getHasName(Items.CHEST), has(Tags.Items.CHESTS_WOODEN))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.RAW_PLAIN_ROLL.get())
                .requires(Items.SUGAR)
                .requires(AllItems.DOUGH)
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR))
                .unlockedBy(getHasName(AllItems.DOUGH), has(AllItems.DOUGH))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get())
                .requires(ModItems.ROASTED_MARSHMALLOW.get())
                .requires(ModItems.ROASTED_MARSHMALLOW.get())
                .requires(Items.STICK)
                .unlockedBy(getHasName(ModItems.ROASTED_MARSHMALLOW.get()), has(ModItems.ROASTED_MARSHMALLOW.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(consumer);

        oreSmelting(consumer, List.of(ModItems.RAW_PLAIN_ROLL.get()), RecipeCategory.FOOD, ModItems.PLAIN_ROLL.get(), 0.35f, 200, "plain_roll");
        oreSmoking(consumer, List.of(ModItems.RAW_PLAIN_ROLL.get()), RecipeCategory.FOOD, ModItems.PLAIN_ROLL.get(), 0.35f, 200, "plain_roll");
        oreCampfireCooking(consumer, List.of(ModItems.RAW_PLAIN_ROLL.get()), RecipeCategory.FOOD, ModItems.PLAIN_ROLL.get(), 0.35f, 200, "plain_roll");
        oreSmelting(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW.get(), 0.35f, 200, "roasted_marshmallow");
        oreSmoking(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW.get(), 0.35f, 200, "roasted_marshmallow");
        oreCampfireCooking(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW.get(), 0.35f, 200, "roasted_marshmallow");
        oreSmelting(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW_ON_A_STICK.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get(), 0.35f, 200, "roasted_marshmallow_on_a_stick");
        oreSmoking(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW_ON_A_STICK.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get(), 0.35f, 200, "roasted_marshmallow_on_a_stick");
        oreCampfireCooking(consumer, List.of(CreateConfectioneryModItems.MARSHMALLOW_ON_A_STICK.get()), RecipeCategory.FOOD, ModItems.ROASTED_MARSHMALLOW_ON_A_STICK.get(), 0.35f, 200, "roasted_marshmallow_on_a_stick");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.CAKE)
                .requires(ModBlocks.CAKE.get())
                .requires(Items.SWEET_BERRIES)
                .unlockedBy(getHasName(ModBlocks.CAKE.get()), has(ModBlocks.CAKE.get()))
                .save(consumer, "sweet_berry_cake");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.WHITE_CHOCOLATE_GLAZED_NUT_MIX.get())
                .requires(ModItemTags.WHITE_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.WHITE_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.GARNISHED_BERRIES)
                .unlockedBy(getHasName(Items.SWEET_BERRIES), has(ModItemTags.GARNISHED_BERRIES))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BLACK_CHOCOLATE_GLAZED_NUT_MIX.get())
                .requires(ModItemTags.BLACK_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.BLACK_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.GARNISHED_BERRIES)
                .unlockedBy(getHasName(Items.SWEET_BERRIES), has(ModItemTags.GARNISHED_BERRIES))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.RUBY_CHOCOLATE_GLAZED_NUT_MIX.get())
                .requires(ModItemTags.RUBY_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.RUBY_CHOCOLATE_GLAZED_NUTS)
                .requires(ModItemTags.GARNISHED_BERRIES)
                .unlockedBy(getHasName(Items.SWEET_BERRIES), has(ModItemTags.GARNISHED_BERRIES))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CARAMEL_GLAZED_NUT_MIX.get())
                .requires(ModItemTags.CARAMEL_GLAZED_NUTS)
                .requires(ModItemTags.CARAMEL_GLAZED_NUTS)
                .requires(ModItemTags.GARNISHED_BERRIES)
                .unlockedBy(getHasName(Items.SWEET_BERRIES), has(ModItemTags.GARNISHED_BERRIES))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreSmoking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smoking");
    }

    protected static void oreCampfireCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_campfire_cooking");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  CreateAllTheFoods.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
