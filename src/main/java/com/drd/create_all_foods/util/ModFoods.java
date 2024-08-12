package com.drd.create_all_foods.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_BREAD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties CINNAMON_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SWEET_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(8.6F).build();
    public static final FoodProperties PEANUT_BUTTER_BREAD = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).build();
    public static final FoodProperties CHOCOLATE_CHIP = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties ROASTED_MARSHMALLOW = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties ROASTED_MARSHMALLOW_ON_A_STICK = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.7F).build();
    public static final FoodProperties CHOCOLATE_SMORE = (new FoodProperties.Builder()).nutrition(13).saturationMod(1.1F).build();
    public static final FoodProperties PEANUT_BUTTER_APPLE = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties PEANUT_BUTTER_WAFFLE = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.8F).build();
}
