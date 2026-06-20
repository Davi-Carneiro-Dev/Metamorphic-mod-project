package dev.davicomaster.metamorphic.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier KYANITE = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            650,
            7.0F,
            2.5F,
            18,
            () -> Ingredient.of(ModItems.KYANITE_INGOT.get())
    );
}