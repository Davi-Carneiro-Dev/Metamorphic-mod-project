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
                        // Bornita - Itens
                        output.accept(ModItems.RAW_BORNITE.get());
                        output.accept(ModItems.BORNITE_NUGGET.get());
                        output.accept(ModItems.BORNITE_SHARD.get());

                        // Bornita - Blocos
                        output.accept(ModBlocks.BORNITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BORNITE_ORE.get());
                        output.accept(ModBlocks.BORNITE_BLOCK.get());
                        output.accept(ModBlocks.BORNITE_LAMP.get());
                        output.accept(ModBlocks.BORNITE_SEA_LANTERN.get());

                        // Estaurolita
                        output.accept(ModBlocks.DEEPSLATE_STAUROLITE_ORE.get());
                        output.accept(ModItems.IMPURE_STAUROLITE.get());
                        output.accept(ModItems.PURE_STAUROLITE.get());
                        output.accept(ModItems.STAUROLITE_TOTEM.get());
                        output.accept(ModItems.STAUROLITE_APPLE.get());

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