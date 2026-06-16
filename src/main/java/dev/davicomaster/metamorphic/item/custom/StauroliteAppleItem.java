package dev.davicomaster.metamorphic.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class StauroliteAppleItem extends Item {
    public StauroliteAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (!level.isClientSide() && entity instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30 * 20, 3));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 120 * 20, 4));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 180 * 20, 1));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300 * 20, 0));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120 * 20, 1));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120 * 20, 1));
        }

        return result;

    }
    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}