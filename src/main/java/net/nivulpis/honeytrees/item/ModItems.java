package net.nivulpis.honeytrees.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nivulpis.honeytrees.HoneyTrees;
import net.nivulpis.honeytrees.block.ModBlocks;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HoneyTrees.MODID);

    public static final Supplier<BlockItem> HONEY_JAR = ITEMS.registerSimpleBlockItem(
            "honey_jar",
            ModBlocks.SLATHERED_HONEY, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
