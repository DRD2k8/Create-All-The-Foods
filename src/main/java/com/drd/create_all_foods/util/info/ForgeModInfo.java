package com.drd.create_all_foods.util.info;

import net.minecraftforge.forgespi.language.IModInfo;

import java.nio.file.Path;
import java.util.List;

public record ForgeModInfo(IModInfo info) implements ModInfo {
    public ForgeModInfo(IModInfo info) {
        this.info = info;
    }

    public String displayName() {
        return this.info.getDisplayName();
    }

    public String id() {
        return this.info.getModId();
    }

    public String version() {
        return this.info.getVersion().toString();
    }

    public List<Path> getPaths() {
        return List.of(this.info.getOwningFile().getFile().getFilePath());
    }

    public IModInfo info() {
        return this.info;
    }
}
