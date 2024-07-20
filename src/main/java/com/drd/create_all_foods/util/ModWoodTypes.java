package com.drd.create_all_foods.util;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType CINNAMON = WoodType.register(new WoodType(CreateAllTheFoods.MOD_ID + ":cinnamon", BlockSetType.CHERRY));
}
