package dev.davicomaster.metamorphic.registry;

import dev.davicomaster.metamorphic.Metamorphic;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import dev.davicomaster.metamorphic.item.custom.StauroliteAppleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Rarity;
import dev.davicomaster.metamorphic.item.custom.PurificationBookItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ArmorItem;
import dev.davicomaster.metamorphic.item.custom.KyaniteTridentItem;
import net.minecraft.world.item.TridentItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Metamorphic.MODID);

    // Bornite - Items
    public static final DeferredItem<Item> RAW_BORNITE =
            ITEMS.registerSimpleItem("raw_bornite", new Item.Properties());

    public static final DeferredItem<Item> BORNITE_NUGGET =
            ITEMS.registerSimpleItem("bornite_nugget", new Item.Properties());

    public static final DeferredItem<Item> BORNITE_SHARD =
            ITEMS.registerSimpleItem("bornite_shard", new Item.Properties());

    // Staurolite - Items

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

    // Kyanite - Items

    public static final DeferredItem<Item> RAW_KYANITE =
            ITEMS.registerSimpleItem("raw_kyanite", new Item.Properties());

    public static final DeferredItem<Item> KYANITE_INGOT =
            ITEMS.registerSimpleItem("kyanite_ingot", new Item.Properties());

    public static final DeferredItem<Item> PURIFIED_KYANITE_INGOT =
            ITEMS.registerSimpleItem("purified_kyanite_ingot", new Item.Properties());

    public static final DeferredItem<Item> KYANITE_DUST =
            ITEMS.registerSimpleItem("kyanite_dust", new Item.Properties());

    public static final DeferredItem<Item> GLASS_DUST =
            ITEMS.registerSimpleItem("glass_dust", new Item.Properties());

    public static final DeferredItem<Item> KYANITE_GLASS_DUST =
            ITEMS.registerSimpleItem("kyanite_glass_dust", new Item.Properties());

    public static final DeferredItem<Item> SHARP_KYANITE_SHARD =
            ITEMS.registerSimpleItem("sharp_kyanite_shard", new Item.Properties());

    // Kyanite - Tools

    public static final DeferredItem<SwordItem> KYANITE_SWORD =
            ITEMS.register("kyanite_sword",
                    () -> new SwordItem(ModToolTiers.KYANITE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .attributes(SwordItem.createAttributes(ModToolTiers.KYANITE, 3, -2.4F))));

    public static final DeferredItem<PickaxeItem> KYANITE_PICKAXE =
            ITEMS.register("kyanite_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.KYANITE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .attributes(PickaxeItem.createAttributes(ModToolTiers.KYANITE, 1, -2.8F))));

    public static final DeferredItem<AxeItem> KYANITE_AXE =
            ITEMS.register("kyanite_axe",
                    () -> new AxeItem(ModToolTiers.KYANITE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .attributes(AxeItem.createAttributes(ModToolTiers.KYANITE, 6, -3.1F))));

    public static final DeferredItem<ShovelItem> KYANITE_SHOVEL =
            ITEMS.register("kyanite_shovel",
                    () -> new ShovelItem(ModToolTiers.KYANITE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .attributes(ShovelItem.createAttributes(ModToolTiers.KYANITE, 1.5F, -3.0F))));

    public static final DeferredItem<HoeItem> KYANITE_HOE =
            ITEMS.register("kyanite_hoe",
                    () -> new HoeItem(ModToolTiers.KYANITE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .attributes(HoeItem.createAttributes(ModToolTiers.KYANITE, -2, -1.0F))));

    public static final DeferredItem<KyaniteTridentItem> KYANITE_TRIDENT =
            ITEMS.register("kyanite_trident",
                    () -> new KyaniteTridentItem(new Item.Properties()
                            .stacksTo(1)
                            .rarity(Rarity.EPIC)
                            .fireResistant()
                            .durability(5000)
                            .attributes(KyaniteTridentItem.createAttributes())));

    // Kyanite - Armour
    public static final DeferredItem<ArmorItem> KYANITE_HELMET =
            ITEMS.register("kyanite_helmet",
                    () -> new ArmorItem(ModArmorMaterials.KYANITE,
                            ArmorItem.Type.HELMET,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .durability(ArmorItem.Type.HELMET.getDurability(25))));

    public static final DeferredItem<ArmorItem> KYANITE_CHESTPLATE =
            ITEMS.register("kyanite_chestplate",
                    () -> new ArmorItem(ModArmorMaterials.KYANITE,
                            ArmorItem.Type.CHESTPLATE,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));

    public static final DeferredItem<ArmorItem> KYANITE_LEGGINGS =
            ITEMS.register("kyanite_leggings",
                    () -> new ArmorItem(ModArmorMaterials.KYANITE,
                            ArmorItem.Type.LEGGINGS,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .durability(ArmorItem.Type.LEGGINGS.getDurability(25))));

    public static final DeferredItem<ArmorItem> KYANITE_BOOTS =
            ITEMS.register("kyanite_boots",
                    () -> new ArmorItem(ModArmorMaterials.KYANITE,
                            ArmorItem.Type.BOOTS,
                            new Item.Properties()
                                    .rarity(Rarity.RARE)
                                    .durability(ArmorItem.Type.BOOTS.getDurability(25))));

    // MISC

    public static final DeferredItem<Item> PURIFICATION_BOOK =
            ITEMS.register("purification_book",
                    () -> new PurificationBookItem(new Item.Properties()
                            .stacksTo(1)
                            .rarity(Rarity.EPIC)));

}