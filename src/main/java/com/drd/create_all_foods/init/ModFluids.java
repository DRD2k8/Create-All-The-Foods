package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<FlowingFluid> PEANUT_BUTTER = FLUIDS.register("peanut_butter",
            () -> new ForgeFlowingFluid.Source(ModFluids.PEANUT_BUTTER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PEANUT_BUTTER = FLUIDS.register("flowing_peanut_butter",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PEANUT_BUTTER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties PEANUT_BUTTER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PEANUT_BUTTER, PEANUT_BUTTER, FLOWING_PEANUT_BUTTER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.PEANUT_BUTTER)
            .bucket(ModItems.PEANUT_BUTTER_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
