package io.github.fallOut015.dreamcatchers.block;

import io.github.fallOut015.dreamcatchers.MainDreamcatchers;
import io.github.fallOut015.dreamcatchers.block.material.MaterialDreamcatchers;
import io.github.fallOut015.dreamcatchers.block.trees.CloudwoodTree;
import io.github.fallOut015.dreamcatchers.block.trees.GhostwoodTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksDreamcatchers {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainDreamcatchers.MODID);



    public static final RegistryObject<Block> GHOSTWOOD_PLANKS = BLOCKS.register("ghostwood_planks", () -> new Block(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_PLANKS = BLOCKS.register("cloudwood_planks", () -> new Block(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_SAPLING = BLOCKS.register("ghostwood_sapling", () -> new SaplingBlock(new GhostwoodTree(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> CLOUDWOOD_SAPLING = BLOCKS.register("cloudwood_sapling", () -> new SaplingBlock(new CloudwoodTree(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> POTTED_GHOSTWOOD_SAPLING = BLOCKS.register("potted_ghostwood_sapling", () -> new FlowerPotBlock(null, GHOSTWOOD_SAPLING, Block.Properties.of(Material.DECORATION).strength(0).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOUDWOOD_SAPLING = BLOCKS.register("potted_cloudwood_sapling", () -> new FlowerPotBlock(null, CLOUDWOOD_SAPLING, Block.Properties.of(Material.DECORATION).strength(0).noOcclusion()));

    public static final RegistryObject<Block> GHOSTWOOD_LOG = BLOCKS.register("ghostwood_log", () -> log(MaterialColor.TERRACOTTA_RED, MaterialColor.SNOW));
    public static final RegistryObject<Block> CLOUDWOOD_LOG = BLOCKS.register("cloudwood_log", () -> log(MaterialColor.SNOW, MaterialColor.COLOR_CYAN));

    public static final RegistryObject<Block> STRIPPED_GHOSTWOOD_LOG = BLOCKS.register("stripped_ghostwood_log", () -> log(MaterialColor.TERRACOTTA_RED, MaterialColor.TERRACOTTA_RED));
    public static final RegistryObject<Block> STRIPPED_CLOUDWOOD_LOG = BLOCKS.register("stripped_cloudwood_log", () -> log(MaterialColor.SNOW, MaterialColor.SNOW));

    public static final RegistryObject<Block> STRIPPED_GHOSTWOOD_WOOD = BLOCKS.register("stripped_ghostwood_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(2.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CLOUDWOOD_WOOD = BLOCKS.register("stripped_cloudwood_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.SNOW).strength(2.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_WOOD = BLOCKS.register("ghostwood_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.SNOW).strength(2.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_WOOD = BLOCKS.register("cloudwood_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_LEAVES = BLOCKS.register("ghostwood_leaves", () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CLOUDWOOD_LEAVES = BLOCKS.register("cloudwood_leaves", () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    public static final RegistryObject<Block> GHOSTWOOD_SLAB = BLOCKS.register("ghostwood_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_SLAB = BLOCKS.register("cloudwood_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_PRESSURE_PLATE = BLOCKS.register("ghostwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_PRESSURE_PLATE = BLOCKS.register("cloudwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_FENCE = BLOCKS.register("ghostwood_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_FENCE = BLOCKS.register("cloudwood_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_TRAPDOOR = BLOCKS.register("ghostwood_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CLOUDWOOD_TRAPDOOR = BLOCKS.register("cloudwood_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> GHOSTWOOD_FENCE_GATE = BLOCKS.register("ghostwood_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_FENCE_GATE = BLOCKS.register("cloudwood_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_STAIRS = BLOCKS.register("ghostwood_stairs", () -> new StairsBlock(GHOSTWOOD_PLANKS.get()::defaultBlockState, Block.Properties.copy(GHOSTWOOD_PLANKS.get())));
    public static final RegistryObject<Block> CLOUDWOOD_STAIRS = BLOCKS.register("cloudwood_stairs", () -> new StairsBlock(CLOUDWOOD_PLANKS.get()::defaultBlockState, Block.Properties.copy(CLOUDWOOD_PLANKS.get())));

    public static final RegistryObject<Block> GHOSTWOOD_BUTTON = BLOCKS.register("ghostwood_button", () -> new WoodButtonBlock(Block.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLOUDWOOD_BUTTON = BLOCKS.register("cloudwood_button", () -> new WoodButtonBlock(Block.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GHOSTWOOD_DOOR = BLOCKS.register("ghostwood_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CLOUDWOOD_DOOR = BLOCKS.register("cloudwood_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> GHOSTWOOD_SIGN = BLOCKS.register("ghostwood_sign", () -> new StandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noCollission().strength(1.0F).sound(SoundType.WOOD), WoodTypeDreamcatchers.GHOSTWOOD));
    public static final RegistryObject<Block> CLOUDWOOD_SIGN = BLOCKS.register("cloudwood_sign", () -> new StandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).noCollission().strength(1.0F).sound(SoundType.WOOD), WoodTypeDreamcatchers.CLOUDWOOD));

    public static final RegistryObject<Block> GHOSTWOOD_WALL_SIGN = BLOCKS.register("ghostwood_wall_sign", () -> new WallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(GHOSTWOOD_SIGN), WoodTypeDreamcatchers.GHOSTWOOD));
    public static final RegistryObject<Block> CLOUDWOOD_WALL_SIGN = BLOCKS.register("cloudwood_wall_sign", () -> new WallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_CYAN).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(CLOUDWOOD_SIGN), WoodTypeDreamcatchers.CLOUDWOOD));

    public static final RegistryObject<Block> GAULT = BLOCKS.register("gault", () -> new Block(Block.Properties.of(MaterialDreamcatchers.GAULT).strength(3.0f).harvestTool(ToolType.SHOVEL).harvestLevel(3).sound(SoundType.SAND)));
    public static final RegistryObject<Block> NIGHTSTONE = BLOCKS.register("nightstone", () -> new Block(Block.Properties.of(MaterialDreamcatchers.NIGHTSTONE).strength(7.0f)));
    public static final RegistryObject<Block> CLOUD = BLOCKS.register("cloud", () -> new Block(Block.Properties.of(MaterialDreamcatchers.CLOUD).strength(0.1f).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> CHAOTIC_DREAMCATCHER = BLOCKS.register("chaotic_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED).strength(0.4F).noOcclusion(), () -> ParticleTypes.ANGRY_VILLAGER, DreamcatcherBlock::chaotic));
    public static final RegistryObject<Block> CLOUDY_DREAMCATCHER = BLOCKS.register("cloudy_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.SNOW).strength(0.4F).noOcclusion(), () -> ParticleTypes.CLOUD, DreamcatcherBlock::cloudy));
    public static final RegistryObject<Block> COLORFUL_DREAMCATCHER = BLOCKS.register("colorful_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN).strength(0.4F).noOcclusion(), () -> ParticleTypes.EFFECT, DreamcatcherBlock::colorful));
    public static final RegistryObject<Block> FORTUITOUS_DREAMCATCHER = BLOCKS.register("fortuitous_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW).strength(0.4F).noOcclusion(), () -> ParticleTypes.FALLING_NECTAR, DreamcatcherBlock::fortuitous));
    public static final RegistryObject<Block> LUCKY_DREAMCATCHER = BLOCKS.register("lucky_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.TERRACOTTA_GREEN).strength(0.4F).noOcclusion(), () -> ParticleTypes.COMPOSTER, DreamcatcherBlock::lucky));
    public static final RegistryObject<Block> MISCHIEVOUS_DREAMCATCHER = BLOCKS.register("mischievous_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK).strength(0.4F).noOcclusion(), () -> ParticleTypes.NOTE, DreamcatcherBlock::mischievous));
    public static final RegistryObject<Block> NIGHTMARISH_DREAMCATCHER = BLOCKS.register("nightmarish_dreamcatcher", () -> new DreamcatcherBlock(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.STONE).strength(0.4F).noOcclusion(), () -> ParticleTypes.WITCH, DreamcatcherBlock::nightmarish));
    public static final RegistryObject<Block> REJUVENATING_DREAMCATCHER = BLOCKS.register("rejuvenating_dreamcatcher", () -> new DreamcatcherBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK).strength(0.4F).noOcclusion(), () -> ParticleTypes.HEART, DreamcatcherBlock::rejuvenating));



    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static RotatedPillarBlock log(MaterialColor p_235430_0_, MaterialColor p_235430_1_) {
        return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, (p_235431_2_) ->
            (p_235431_2_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_235430_0_ : p_235430_1_)
        ).strength(2.0F).sound(SoundType.WOOD));
    }
}