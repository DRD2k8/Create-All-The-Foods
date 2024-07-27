package com.drd.create_all_foods.item;

import com.drd.create_all_foods.util.ModFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlackChocolateGlazedNutMixFoodItem extends Item {
    public BlackChocolateGlazedNutMixFoodItem(Properties properties) {
        super(properties.food(ModFoods.BLACK_CHOCOLATE_GLAZED_NUT_MIX).stacksTo(16));
    }

    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
        tooltip.add(Component.translatable("text.create_all_foods.nut.black_chocolate_glazed").setStyle(Style.EMPTY.withColor(5118486)));
        tooltip.add(Component.literal("§9Stimulation (0:06)"));
    }
}
