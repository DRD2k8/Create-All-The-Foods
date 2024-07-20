package com.drd.create_all_foods.block;

import com.drd.create_all_foods.init.ModBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;

public class CinnamonWoodBlock extends RotatedPillarBlock {
    public CinnamonWoodBlock(Properties p_55926_) {
        super(p_55926_);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.CINNAMON_LOG.get())) {
                return ModBlocks.STRIPPED_CINNAMON_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.CINNAMON_WOOD.get())) {
                return ModBlocks.STRIPPED_CINNAMON_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
