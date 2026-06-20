package dev.davicomaster.metamorphic.registry;

import dev.davicomaster.metamorphic.Metamorphic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Metamorphic.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> METAMORPHIC_TAB =
            CREATIVE_MODE_TABS.register("metamorphic_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.metamorphic"))
                    .icon(() -> new ItemStack(ModBlocks.BORNITE_BLOCK.get()))
                    .displayItems((parameters, output) -> {

                        // Bornite - Items
                        output.accept(ModItems.RAW_BORNITE.get());
                        output.accept(ModItems.BORNITE_NUGGET.get());
                        output.accept(ModItems.BORNITE_SHARD.get());

                        // Bornite - Bloks
                        output.accept(ModBlocks.BORNITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BORNITE_ORE.get());
                        output.accept(ModBlocks.BORNITE_BLOCK.get());
                        output.accept(ModBlocks.BORNITE_LAMP.get());
                        output.accept(ModBlocks.BORNITE_SEA_LANTERN.get());

                        // Staurolite - All
                        output.accept(ModBlocks.DEEPSLATE_STAUROLITE_ORE.get());
                        output.accept(ModItems.IMPURE_STAUROLITE.get());
                        output.accept(ModItems.PURE_STAUROLITE.get());
                        output.accept(ModItems.STAUROLITE_TOTEM.get());
                        output.accept(ModItems.STAUROLITE_APPLE.get());

                        // Kyanite - Items
                        output.accept(ModItems.RAW_KYANITE.get());
                        output.accept(ModItems.PURIFIED_KYANITE_INGOT.get());
                        output.accept(ModItems.KYANITE_INGOT.get());
                        output.accept(ModItems.KYANITE_DUST.get());
                        output.accept(ModItems.GLASS_DUST.get());
                        output.accept(ModItems.KYANITE_GLASS_DUST.get());

                        // Kyanite - Blocks
                        output.accept(ModBlocks.KYANITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_KYANITE_ORE.get());
                        output.accept(ModBlocks.KYANITE_BLOCK.get());
                        output.accept(ModBlocks.KYANITE_GLASS.get());
                        output.accept(ModBlocks.KYANITE_GLASS_PANE.get());
                        output.accept(ModItems.SHARP_KYANITE_SHARD.get());

                        // Kyanite - Tools
                        output.accept(ModItems.KYANITE_SWORD.get());
                        output.accept(ModItems.KYANITE_PICKAXE.get());
                        output.accept(ModItems.KYANITE_AXE.get());
                        output.accept(ModItems.KYANITE_SHOVEL.get());
                        output.accept(ModItems.KYANITE_HOE.get());
                        output.accept(ModItems.KYANITE_TRIDENT.get());

                        // Kyanite - Armour
                        output.accept(ModItems.KYANITE_HELMET.get());
                        output.accept(ModItems.KYANITE_CHESTPLATE.get());
                        output.accept(ModItems.KYANITE_LEGGINGS.get());
                        output.accept(ModItems.KYANITE_BOOTS.get());

                        //MISC
                        output.accept(ModItems.PURIFICATION_BOOK.get());
                    })
                    .build());
}

//Future Org

//Ores

//Blocks

//items

//Armour

//Food

//Misc