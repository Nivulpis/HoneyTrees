package net.nivulpis.honeytrees.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nivulpis.honeytrees.HoneyTrees;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HoneyTrees.MODID);

    public static final DeferredItem<Item> HONEY_JAR = ITEMS.register("honey_jar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
