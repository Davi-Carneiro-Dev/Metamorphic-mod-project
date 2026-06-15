package dev.davicomaster.metamorphic.registry;

import dev.davicomaster.metamorphic.Metamorphic;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Metamorphic.MODID);

    // Bornita - Itens
    public static final DeferredItem<Item> RAW_BORNITE =
            ITEMS.registerSimpleItem("raw_bornite", new Item.Properties());

    public static final DeferredItem<Item> BORNITE_NUGGET =
            ITEMS.registerSimpleItem("bornite_nugget", new Item.Properties());

    public static final DeferredItem<Item> BORNITE_SHARD =
            ITEMS.registerSimpleItem("bornite_shard", new Item.Properties());
}