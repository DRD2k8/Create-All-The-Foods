package com.drd.create_all_foods.util.info;

import java.nio.file.Path;
import java.util.List;

public interface ModInfo {
    String displayName();

    String id();

    String version();

    List<Path> getPaths();
}
