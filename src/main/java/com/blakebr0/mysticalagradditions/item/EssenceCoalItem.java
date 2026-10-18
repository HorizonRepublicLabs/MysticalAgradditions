package com.blakebr0.mysticalagradditions.item;

import com.blakebr0.cucumber.item.BaseItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;

public class EssenceCoalItem extends BaseItem {
    public EssenceCoalItem(Identifier id, int fuel) {
        super(id, p -> p.component(DataComponents.COOKING_FUEL, cookingFuel(fuel)));
    }

    static CookingFuel cookingFuel(int burnTime) {
        return new CookingFuel(new ResolvableInt.Constant(burnTime), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER));
    }
}
