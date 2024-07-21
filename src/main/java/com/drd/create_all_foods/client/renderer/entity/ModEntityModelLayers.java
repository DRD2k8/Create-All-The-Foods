package com.drd.create_all_foods.client.renderer.entity;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModEntityModelLayers {
    public static final ModelLayerLocation CINNAMON_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CreateAllTheFoods.MOD_ID, "boat/cinnamon"), "main");
    public static final ModelLayerLocation CINNAMON_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CreateAllTheFoods.MOD_ID, "chest_boat/cinnamon"), "main");
}
