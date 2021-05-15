package io.github.fallOut015.dreamcatchers.item;

import io.github.fallOut015.dreamcatchers.MainDreamcatchers;
import io.github.fallOut015.dreamcatchers.block.BlocksDreamcatchers;
import io.github.fallOut015.dreamcatchers.util.SoundEventsDreamcatchers;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsDreamcatchers {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainDreamcatchers.MODID);



    // Building Blocks
    public static final RegistryObject<Item> GHOSTWOOD_PLANKS = ITEMS.register("ghostwood_planks", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CLOUDWOOD_PLANKS = ITEMS.register("cloudwood_planks", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GHOSTWOOD_LOG = ITEMS.register("ghostwood_log", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CLOUDWOOD_LOG = ITEMS.register("cloudwood_log", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_GHOSTWOOD_LOG = ITEMS.register("stripped_ghostwood_log", () -> new BlockItem(BlocksDreamcatchers.STRIPPED_GHOSTWOOD_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_CLOUDWOOD_LOG = ITEMS.register("stripped_cloudwood_log", () -> new BlockItem(BlocksDreamcatchers.STRIPPED_CLOUDWOOD_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GHOSTWOOD_WOOD = ITEMS.register("ghostwood_wood", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CLOUDWOOD_WOOD = ITEMS.register("cloudwood_wood", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_GHOSTWOOD_WOOD = ITEMS.register("stripped_ghostwood_wood", () -> new BlockItem(BlocksDreamcatchers.STRIPPED_GHOSTWOOD_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> STRIPPED_CLOUDWOOD_WOOD = ITEMS.register("stripped_cloudwood_wood", () -> new BlockItem(BlocksDreamcatchers.STRIPPED_CLOUDWOOD_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GHOSTWOOD_SLAB = ITEMS.register("ghostwood_slab", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CLOUDWOOD_SLAB = ITEMS.register("cloudwood_slab", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GHOSTWOOD_STAIRS = ITEMS.register("ghostwood_stairs", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CLOUDWOOD_STAIRS = ITEMS.register("cloudwood_stairs", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> GAULT = ITEMS.register("gault", () -> new BlockItem(BlocksDreamcatchers.GAULT.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CLOUD = ITEMS.register("cloud", () -> new BlockItem(BlocksDreamcatchers.CLOUD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> NIGHTSTONE = ITEMS.register("nightstone", () -> new BlockItem(BlocksDreamcatchers.NIGHTSTONE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // Decorations
    public static final RegistryObject<Item> GHOSTWOOD_SAPLING = ITEMS.register("ghostwood_sapling", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_SAPLING.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));
    public static final RegistryObject<Item> CLOUDWOOD_SAPLING = ITEMS.register("cloudwood_sapling", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_SAPLING.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));

    public static final RegistryObject<Item> GHOSTWOOD_LEAVES = ITEMS.register("ghostwood_leaves", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_LEAVES.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));
    public static final RegistryObject<Item> CLOUDWOOD_LEAVES = ITEMS.register("cloudwood_leaves", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_LEAVES.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));

    public static final RegistryObject<Item> GHOSTWOOD_FENCE = ITEMS.register("ghostwood_fence", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_FENCE.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));
    public static final RegistryObject<Item> CLOUDWOOD_FENCE = ITEMS.register("cloudwood_fence", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_FENCE.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));

    public static final RegistryObject<Item> GHOSTWOOD_SIGN = ITEMS.register("ghostwood_sign", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_SIGN.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));
    public static final RegistryObject<Item> CLOUDWOOD_SIGN = ITEMS.register("cloudwood_sign", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_SIGN.get(), new Item.Properties()/*.tab(ItemGroup.DECORATIONS)*/));

    public static final RegistryObject<Item> CHAOTIC_DREAMCATCHER = ITEMS.register("chaotic_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.CHAOTIC_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CLOUDY_DREAMCATCHER = ITEMS.register("cloudy_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.CLOUDY_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> COLORFUL_DREAMCATCHER = ITEMS.register("colorful_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.COLORFUL_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> FORTUITOUS_DREAMCATCHER = ITEMS.register("fortuitous_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.FORTUITOUS_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LUCKY_DREAMCATCHER = ITEMS.register("lucky_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.LUCKY_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MISCHIEVOUS_DREAMCATCHER = ITEMS.register("mischievous_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.MISCHIEVOUS_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> NIGHTMARISH_DREAMCATCHER = ITEMS.register("nightmarish_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.NIGHTMARISH_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> REJUVENATING_DREAMCATCHER = ITEMS.register("rejuvenating_dreamcatcher", () -> new BlockItem(BlocksDreamcatchers.REJUVENATING_DREAMCATCHER.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    // Redstone
    public static final RegistryObject<Item> GHOSTWOOD_PRESSURE_PLATE = ITEMS.register("ghostwood_pressure_plate", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_PRESSURE_PLATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CLOUDWOOD_PRESSURE_PLATE = ITEMS.register("cloudwood_pressure_plate", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_PRESSURE_PLATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> GHOSTWOOD_TRAPDOOR = ITEMS.register("ghostwood_trapdoor", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_TRAPDOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CLOUDWOOD_TRAPDOOR = ITEMS.register("cloudwood_trapdoor", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_TRAPDOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> GHOSTWOOD_FENCE_GATE = ITEMS.register("ghostwood_fence_gate", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CLOUDWOOD_FENCE_GATE = ITEMS.register("cloudwood_fence_gate", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> GHOSTWOOD_BUTTON = ITEMS.register("ghostwood_button", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_BUTTON.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CLOUDWOOD_BUTTON = ITEMS.register("cloudwood_button", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_BUTTON.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> GHOSTWOOD_DOOR = ITEMS.register("ghostwood_door", () -> new BlockItem(BlocksDreamcatchers.GHOSTWOOD_DOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
    public static final RegistryObject<Item> CLOUDWOOD_DOOR = ITEMS.register("cloudwood_door", () -> new BlockItem(BlocksDreamcatchers.CLOUDWOOD_DOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    // Transportation
    public static final RegistryObject<Item> GHOSTWOOD_BOAT = ITEMS.register("ghostwood_boat", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));
    public static final RegistryObject<Item> CLOUDWOOD_BOAT = ITEMS.register("cloudwood_boat", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    // Misc
    public static final RegistryObject<Item> MUSIC_DISC_BAD_DREAMS = ITEMS.register("music_disc_bad_dreams", () -> new MusicDiscItem(13, SoundEventsDreamcatchers.MUSIC_NIGHTMARE, new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}