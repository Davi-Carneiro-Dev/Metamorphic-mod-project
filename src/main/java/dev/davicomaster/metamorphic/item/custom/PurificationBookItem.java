package dev.davicomaster.metamorphic.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PurificationBookItem extends Item {
    public PurificationBookItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}