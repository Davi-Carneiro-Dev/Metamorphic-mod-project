package dev.davicomaster.metamorphic.registry;

import dev.davicomaster.metamorphic.Metamorphic;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import dev.davicomaster.metamorphic.item.custom.StauroliteAppleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Rarity;
import dev.davicomaster.metamorphic.item.custom.PurificationBookItem;

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

    // Estaurolita - Itens

    public static final DeferredItem<Item> IMPURE_STAUROLITE =
            ITEMS.registerSimpleItem("impure_staurolite",
                    new Item.Properties().rarity(Rarity.RARE));

    public static final DeferredItem<Item> PURE_STAUROLITE =
            ITEMS.registerSimpleItem("pure_staurolite",
                    new Item.Properties().rarity(Rarity.EPIC));

    public static final DeferredItem<Item> STAUROLITE_TOTEM =
            ITEMS.registerSimpleItem("staurolite_totem",
                    new Item.Properties()
                            .stacksTo(1)
                            .rarity(Rarity.EPIC)
                            .fireResistant());

    public static final DeferredItem<Item> STAUROLITE_APPLE =
            ITEMS.register("staurolite_apple",
                    () -> new StauroliteAppleItem(new Item.Properties()
                            .rarity(Rarity.EPIC)
                            .fireResistant()
                            .food(new FoodProperties.Builder()
                                    .nutrition(4)
                                    .saturationModifier(1.2F)
                                    .alwaysEdible()
                                    .build())));

    // MISC

    public static final DeferredItem<Item> PURIFICATION_BOOK =
            ITEMS.register("purification_book",
                    () -> new PurificationBookItem(new Item.Properties()
                            .stacksTo(1)
                            .rarity(Rarity.EPIC)));

}