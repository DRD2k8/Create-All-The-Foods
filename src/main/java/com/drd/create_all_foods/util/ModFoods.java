package com.drd.create_all_foods.util;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_BREAD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties CINNAMON_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SWEET_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(8.6F).build();
}
