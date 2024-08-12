package com.drd.create_all_foods.util;

import com.drd.create_all_foods.util.info.ForgeModInfo;
import com.drd.create_all_foods.util.info.ModInfo;
import net.minecraftforge.fml.ModList;
import org.jetbrains.annotations.Nullable;

public class ModInfoUtilsImpl {
    public static @Nullable ModInfo getModInfo(String id) {
        return (ModInfo) ModList.get().getModContainerById(id).map((modContainer) -> {
            return new ForgeModInfo(modContainer.getModInfo());
        }).orElse((ForgeModInfo) null);
    }
}
