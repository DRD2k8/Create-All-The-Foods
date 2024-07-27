package com.drd.create_all_foods.datagen;

import com.drd.create_all_foods.CreateAllTheFoods;
import com.drd.create_all_foods.datagen.tag.ModItemTags;
import com.drd.create_all_foods.init.ModBlocks;
import com.drd.create_all_foods.init.ModItems;
import net.antopfr.create_factory.registry.CFItems;
import net.mcreator.createconfectionery.init.CreateConfectioneryModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CreateAllTheFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .addTag(ModItemTags.CINNAMON_LOGS);

        this.tag(ModItemTags.CINNAMON_LOGS)
                .add(ModBlocks.CINNAMON_LOG.get().asItem())
                .add(ModBlocks.CINNAMON_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CINNAMON_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CINNAMON_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.CINNAMON_PLANKS.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.CINNAMON_LEAVES.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(ModBlocks.CINNAMON_SAPLING.get().asItem());

        this.tag(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.CINNAMON_STAIRS.get().asItem());

        this.tag(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.CINNAMON_SLAB.get().asItem());

        this.tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.CINNAMON_FENCE.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.CINNAMON_FENCE_GATE.get().asItem());

        this.tag(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.CINNAMON_DOOR.get().asItem());

        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CINNAMON_TRAPDOOR.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CINNAMON_PRESSURE_PLATE.get().asItem());

        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.CINNAMON_BUTTON.get().asItem());

        this.tag(ModItemTags.CINNAMON)
                .add(ModItems.CINNAMON.get());

        this.tag(ItemTags.SIGNS)
                .add(ModItems.CINNAMON_SIGN.get());

        this.tag(ItemTags.HANGING_SIGNS)
                .add(ModItems.CINNAMON_HANGING_SIGN.get());

        this.tag(ItemTags.BOATS)
                .add(ModItems.CINNAMON_BOAT.get());

        this.tag(ItemTags.CHEST_BOATS)
                .add(ModItems.CINNAMON_CHEST_BOAT.get());

        this.tag(ModItemTags.NUTS)
                .addTag(ModItemTags.WHITE_CHOCOLATE_GLAZED_NUTS)
                .addTag(ModItemTags.BLACK_CHOCOLATE_GLAZED_NUTS)
                .addTag(ModItemTags.RUBY_CHOCOLATE_GLAZED_NUTS)
                .addTag(ModItemTags.CARAMEL_GLAZED_NUTS);

        this.tag(ModItemTags.NUT_MIXES)
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_NUT_MIX.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_NUT_MIX.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_NUT_MIX.get())
                .add(ModItems.CARAMEL_GLAZED_NUT_MIX.get());

        this.tag(ModItemTags.WHITE_CHOCOLATE_GLAZED_NUTS)
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_CASHEW.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_WALNUT.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_ALMOND.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_PECAN.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_PISTACHIO.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_MACADAMIA.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_PEANUT.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_HAZELNUT.get())
                .add(ModItems.WHITE_CHOCOLATE_GLAZED_CHESTNUT.get());

        this.tag(ModItemTags.BLACK_CHOCOLATE_GLAZED_NUTS)
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_CASHEW.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_WALNUT.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_ALMOND.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_PECAN.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_PISTACHIO.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_MACADAMIA.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_PEANUT.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_HAZELNUT.get())
                .add(ModItems.BLACK_CHOCOLATE_GLAZED_CHESTNUT.get());

        this.tag(ModItemTags.RUBY_CHOCOLATE_GLAZED_NUTS)
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_CASHEW.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_WALNUT.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_ALMOND.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_PECAN.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_PISTACHIO.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_MACADAMIA.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_PEANUT.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_HAZELNUT.get())
                .add(ModItems.RUBY_CHOCOLATE_GLAZED_CHESTNUT.get());

        this.tag(ModItemTags.CARAMEL_GLAZED_NUTS)
                .add(ModItems.CARAMEL_GLAZED_CASHEW.get())
                .add(ModItems.CARAMEL_GLAZED_WALNUT.get())
                .add(ModItems.CARAMEL_GLAZED_ALMOND.get())
                .add(ModItems.CARAMEL_GLAZED_PECAN.get())
                .add(ModItems.CARAMEL_GLAZED_PISTACHIO.get())
                .add(ModItems.CARAMEL_GLAZED_MACADAMIA.get())
                .add(ModItems.CARAMEL_GLAZED_PEANUT.get())
                .add(ModItems.CARAMEL_GLAZED_HAZELNUT.get())
                .add(ModItems.CARAMEL_GLAZED_CHESTNUT.get());

        this.tag(ModItemTags.GARNISHED_BERRIES)
                .addOptional(CreateConfectioneryModItems.WHITE_CHOCOLATE_GLAZED_BERRIES.getId())
                .addOptional(CreateConfectioneryModItems.BLACK_CHOCOLATE_GLAZED_BERRIES.getId())
                .addOptional(CreateConfectioneryModItems.RUBY_CHOCOLATE_GLAZED_BERRIES.getId())
                .addOptional(CreateConfectioneryModItems.CARAMEL_GLAZED_BERRIES.getId());
    }
}
