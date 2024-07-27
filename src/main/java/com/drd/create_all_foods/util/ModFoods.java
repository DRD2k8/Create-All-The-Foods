package com.drd.create_all_foods.util;

import net.mcreator.createconfectionery.init.CreateConfectioneryModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_BREAD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties CINNAMON_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SWEET_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(8.6F).build();
    public static final FoodProperties PEANUT_BUTTER_BREAD = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).build();
    public static final FoodProperties WHITE_CHOCOLATE_CHIP_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.REST.get(), 600, 1), 1.0F).build();
    public static final FoodProperties BLACK_CHOCOLATE_CHIP_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.STIMULATION.get(), 120, 1), 1.0F).build();
    public static final FoodProperties RUBY_CHOCOLATE_CHIP_COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0F).build();
    public static final FoodProperties CHOCOLATE_CHIP = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties WHITE_CHOCOLATE_CHIP = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.REST.get(), 600, 1), 1.0F).build();
    public static final FoodProperties BLACK_CHOCOLATE_CHIP = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.STIMULATION.get(), 120, 1), 1.0F).build();
    public static final FoodProperties RUBY_CHOCOLATE_CHIP = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0F).build();
    public static final FoodProperties ROASTED_MARSHMALLOW = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties ROASTED_MARSHMALLOW_ON_A_STICK = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.7F).build();
    public static final FoodProperties CHOCOLATE_SMORE = (new FoodProperties.Builder()).nutrition(13).saturationMod(1.1F).build();
    public static final FoodProperties WHITE_CHOCOLATE_SMORE = (new FoodProperties.Builder()).nutrition(13).saturationMod(1.1F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.REST.get(), 600, 1), 1.0F).build();
    public static final FoodProperties BLACK_CHOCOLATE_SMORE = (new FoodProperties.Builder()).nutrition(13).saturationMod(1.1F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.STIMULATION.get(), 120, 1), 1.0F).build();
    public static final FoodProperties RUBY_CHOCOLATE_SMORE = (new FoodProperties.Builder()).nutrition(13).saturationMod(1.1F).effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0F).build();
    public static final FoodProperties WHITE_CHOCOLATE_GLAZED_NUT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.REST.get(), 600, 1), 1.0F).build();
    public static final FoodProperties BLACK_CHOCOLATE_GLAZED_NUT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.STIMULATION.get(), 120, 1), 1.0F).build();
    public static final FoodProperties RUBY_CHOCOLATE_GLAZED_NUT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0F).build();
    public static final FoodProperties CARAMEL_GLAZED_NUT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1.0F).build();
    public static final FoodProperties WHITE_CHOCOLATE_GLAZED_NUT_MIX = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.REST.get(), 600, 1), 1.0F).build();
    public static final FoodProperties BLACK_CHOCOLATE_GLAZED_NUT_MIX = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(CreateConfectioneryModMobEffects.STIMULATION.get(), 120, 1), 1.0F).build();
    public static final FoodProperties RUBY_CHOCOLATE_GLAZED_NUT_MIX = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0F).build();
    public static final FoodProperties CARAMEL_GLAZED_NUT_MIX = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1.0F).build();
}
