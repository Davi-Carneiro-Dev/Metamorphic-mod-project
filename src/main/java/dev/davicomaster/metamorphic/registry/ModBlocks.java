package dev.davicomaster.metamorphic.registry;

import dev.davicomaster.metamorphic.Metamorphic;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;
import net.minecraft.world.level.block.IronBarsBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Metamorphic.MODID);

    // Bornite - Ores
    public static final DeferredBlock<Block> BORNITE_ORE = registerBlock(
            "bornite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE))
    );

    public static final DeferredBlock<Block> DEEPSLATE_BORNITE_ORE = registerBlock(
            "deepslate_bornite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE))
    );

    // Bornite - Decorative Blocks

    public static final DeferredBlock<Block> BORNITE_BLOCK = registerBlock(
            "bornite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL))
    );

    public static final DeferredBlock<Block> BORNITE_SEA_LANTERN = registerBlock(
            "bornite_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3F)
                    .lightLevel(state -> 15)
                    .sound(SoundType.GLASS))
    );

    public static final DeferredBlock<RedstoneLampBlock> BORNITE_LAMP = registerBlock(
            "bornite_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3F)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)
                    .sound(SoundType.GLASS))
    );

    // Staurolite - Ores

    public static final DeferredBlock<Block> DEEPSLATE_STAUROLITE_ORE = registerBlock(
            "deepslate_staurolite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE))
    );

    // Kyanite - Ores

    public static final DeferredBlock<Block> KYANITE_ORE = registerBlock(
            "kyanite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE))
    );

    public static final DeferredBlock<Block> DEEPSLATE_KYANITE_ORE = registerBlock(
            "deepslate_kyanite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE))
    );

    // Kyanite - Decorative Blocks

    public static final DeferredBlock<Block> KYANITE_BLOCK = registerBlock(
            "kyanite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL))
    );

    public static final DeferredBlock<Block> KYANITE_GLASS = registerBlock(
            "kyanite_glass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion())
    );

    public static final DeferredBlock<IronBarsBlock> KYANITE_GLASS_PANE = registerBlock(
            "kyanite_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion())
    );



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> registeredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}