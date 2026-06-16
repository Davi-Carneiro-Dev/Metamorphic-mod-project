package dev.davicomaster.metamorphic.event;

import dev.davicomaster.metamorphic.Metamorphic;
import dev.davicomaster.metamorphic.registry.ModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import dev.davicomaster.metamorphic.Metamorphic;
import dev.davicomaster.metamorphic.registry.ModItems;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AnvilUpdateEvent;

@EventBusSubscriber(modid = Metamorphic.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (!(event.getEntity() instanceof Player player)) {
            return;
        }

        ItemStack totemStack = getStauroliteTotem(player);

        if (totemStack.isEmpty()) {
            return;
        }

        event.setCanceled(true);

        if (!player.getAbilities().instabuild) {
            totemStack.shrink(1);
        }

        player.setHealth(4.0F);
        player.removeAllEffects();

        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 45 * 20, 1));
        player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 60 * 20, 1));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 20, 0));
        player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60 * 20, 0));

        player.level().broadcastEntityEvent(player, (byte) 35);
    }

    private static ItemStack getStauroliteTotem(Player player) {
        ItemStack mainHand = player.getItemInHand(InteractionHand.MAIN_HAND);

        if (mainHand.is(ModItems.STAUROLITE_TOTEM.get())) {
            return mainHand;
        }

        ItemStack offHand = player.getItemInHand(InteractionHand.OFF_HAND);

        if (offHand.is(ModItems.STAUROLITE_TOTEM.get())) {
            return offHand;
        }

        return ItemStack.EMPTY;
    }

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {
        ItemStack left = event.getLeft();
        ItemStack right = event.getRight();

        if (!left.is(ModItems.IMPURE_STAUROLITE.get())) {
            return;
        }

        if (!right.is(ModItems.PURIFICATION_BOOK.get())) {
            return;
        }

        // Segurança: evita colocar uma stack inteira na bigorna e perder vários itens.
        // O jogador deve colocar apenas 1 impure_staurolite no slot esquerdo.
        if (left.getCount() != 1) {
            return;
        }

        event.setOutput(new ItemStack(ModItems.PURE_STAUROLITE.get()));
        event.setCost(30);
        event.setMaterialCost(1);
    }
}
