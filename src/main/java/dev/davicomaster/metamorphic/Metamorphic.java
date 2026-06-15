package dev.davicomaster.metamorphic;

import com.mojang.logging.LogUtils;
import dev.davicomaster.metamorphic.registry.ModBlocks;
import dev.davicomaster.metamorphic.registry.ModCreativeTabs;
import dev.davicomaster.metamorphic.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Metamorphic.MODID)
public class Metamorphic {
    public static final String MODID = "metamorphic";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Metamorphic(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }
}