package com.blakebr0.mysticalagradditions.item;

import com.blakebr0.cucumber.item.BaseBlockItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public class EssenceCoalBlockItem extends BaseBlockItem {
    public EssenceCoalBlockItem(Identifier id, Block block, int fuel) {
        super(id, block, p -> p.component(DataComponents.COOKING_FUEL, EssenceCoalItem.cookingFuel(fuel)));
    }
}
