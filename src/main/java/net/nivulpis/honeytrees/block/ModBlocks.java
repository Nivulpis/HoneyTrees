package net.nivulpis.honeytrees.block;

import net.minecraft.world.level.block.SoundType;
import net.nivulpis.honeytrees.HoneyTrees;
import net.nivulpis.honeytrees.block.custom.SlatheredHoneyBlock;
import net.nivulpis.honeytrees.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HoneyTrees.MODID);

    public static final DeferredBlock<Block> SLATHERED_HONEY = registerBlock("slathered_honey",
            () -> new SlatheredHoneyBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .noLootTable()
                    .sound(SoundType.HONEY_BLOCK)
                    .noCollission()
            )
    );

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}