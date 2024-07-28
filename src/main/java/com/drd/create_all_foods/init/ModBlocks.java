package com.drd.create_all_foods.init;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.block.*;
import com.drd.create_all_foods.util.ModWoodTypes;
import com.drd.create_all_foods.worldgen.tree.CinnamonTreeGrower;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateAllTheFoods.MOD_ID);

    public static final RegistryObject<Block> CAKE = registerBlock("cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of().forceSolidOn().strength(0.5F).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
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
    public static final RegistryObject<Block> CINNAMON_STAIRS = registerBlock("cinnamon_stairs",
            () -> new StairBlock(CINNAMON_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> CINNAMON_SLAB = registerBlock("cinnamon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> CINNAMON_FENCE = registerBlock("cinnamon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> CINNAMON_FENCE_GATE = registerBlock("cinnamon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD), WoodType.CHERRY));
    public static final RegistryObject<Block> CINNAMON_DOOR = registerBlock("cinnamon_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final RegistryObject<Block> CINNAMON_TRAPDOOR = registerBlock("cinnamon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final RegistryObject<Block> CINNAMON_PRESSURE_PLATE = registerBlock("cinnamon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final RegistryObject<Block> CINNAMON_BUTTON = registerBlock("cinnamon_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(CINNAMON_PLANKS.get().defaultMapColor()).sound(SoundType.CHERRY_WOOD), BlockSetType.CHERRY, 30, true));
    public static final RegistryObject<Block> CINNAMON_SIGN = BLOCKS.register("cinnamon_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), ModWoodTypes.CINNAMON));
    public static final RegistryObject<Block> CINNAMON_WALL_SIGN = BLOCKS.register("cinnamon_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), ModWoodTypes.CINNAMON));
    public static final RegistryObject<Block> CINNAMON_HANGING_SIGN = BLOCKS.register("cinnamon_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), ModWoodTypes.CINNAMON));
    public static final RegistryObject<Block> CINNAMON_WALL_HANGING_SIGN = BLOCKS.register("cinnamon_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), ModWoodTypes.CINNAMON));
    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock("cinnamon_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.CHERRY_LEAVES)));
    public static final RegistryObject<Block> CINNAMON_SAPLING = registerBlock("cinnamon_sapling",
            () -> new SaplingBlock(new CinnamonTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).sound(SoundType.CHERRY_LEAVES)));
    public static final RegistryObject<LiquidBlock> PEANUT_BUTTER = BLOCKS.register("peanut_butter",
            () -> new LiquidBlock(ModFluids.PEANUT_BUTTER, BlockBehaviour.Properties.copy(Blocks.WATER)));

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
