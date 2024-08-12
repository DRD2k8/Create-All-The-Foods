package com.drd.create_all_foods.item;

import com.drd.create_all_foods.compat.create_confectionery.util.ModCreateConfectioneryFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WhiteChocolateGlazedNutFoodItem extends Item {
    public WhiteChocolateGlazedNutFoodItem(Item.Properties properties) {
        super(properties.food(ModCreateConfectioneryFoods.WHITE_CHOCOLATE_GLAZED_NUT));
    }

    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
        tooltip.add(Component.translatable("text.create_all_foods.nut.white_chocolate_glazed").setStyle(Style.EMPTY.withColor(14657648)));
        tooltip.add(Component.literal("§9Rest (0:30)"));
    }
}
