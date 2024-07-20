package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.block.CinnamonWoodBlock;
import com.drd.create_all_foods.worldgen.tree.CinnamonTreeGrower;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Block> CINNAMON_LOG = registerBlock("cinnamon_log",
            () -> new CinnamonWoodBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
                return p_152624_.getValue(CinnamonWoodBlock.AXIS) == Direction.Axis.Y ? MapColor.COLOR_ORANGE : MapColor.PODZOL;
            }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CINNAMON_WOOD = registerBlock("cinnamon_wood",
            () -> new CinnamonWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CINNAMON_LOG = registerBlock("stripped_cinnamon_log",
            () -> new CinnamonWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_CINNAMON_WOOD = registerBlock("stripped_cinnamon_wood",
            () -> new CinnamonWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock("cinnamon_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.CHERRY_LEAVES)));
    public static final RegistryObject<Block> CINNAMON_SAPLING = registerBlock("cinnamon_sapling",
            () -> new SaplingBlock(new CinnamonTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).sound(SoundType.CHERRY_LEAVES)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
