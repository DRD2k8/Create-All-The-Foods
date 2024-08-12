package com.drd.create_all_foods.util;

import com.drd.create_all_foods.util.info.ModInfo;
import org.jetbrains.annotations.Nullable;

public class ModInfoUtils {
    public static boolean isModLoaded(String id) {
        return getModInfo(id) != null;
    }

    public static @Nullable ModInfo getModInfo(String id) {
        return ModInfoUtilsImpl.getModInfo(id);
    }
}
