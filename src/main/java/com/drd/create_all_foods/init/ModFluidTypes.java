package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.fluid.BaseSolidFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<FluidType> PEANUT_BUTTER = registerSolidFluid("peanut_butter",
            new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/peanut_butter_still"),
            new ResourceLocation(CreateAllTheFoods.MOD_ID, "block/peanut_butter_flow"),
            FluidType.Properties.create().lightLevel(2).density(50).viscosity(50).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> registerSolidFluid(String name, final ResourceLocation stillTexture, final ResourceLocation flowingTexture, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseSolidFluidType(stillTexture, flowingTexture, properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
