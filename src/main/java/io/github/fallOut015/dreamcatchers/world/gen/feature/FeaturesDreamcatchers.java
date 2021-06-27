package io.github.fallOut015.dreamcatchers.world.gen.feature;

import io.github.fallOut015.dreamcatchers.block.BlocksDreamcatchers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class FeaturesDreamcatchers {
    public static final class Features {
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GHOSTWOOD = Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.GHOSTWOOD_LOG), new SimpleBlockStateProvider(States.GHOSTWOOD_LEAVES), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build());
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CLOUDWOOD = Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CLOUDWOOD_LOG), new SimpleBlockStateProvider(States.CLOUDWOOD_LEAVES), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build());
    }

    public static final class Configs {
    }

    public static final class Placements {
    }

    public static final class States {
        protected static final BlockState GHOSTWOOD_LOG = BlocksDreamcatchers.GHOSTWOOD_LOG.get().defaultBlockState();
        protected static final BlockState GHOSTWOOD_LEAVES = BlocksDreamcatchers.GHOSTWOOD_LEAVES.get().defaultBlockState();
        protected static final BlockState CLOUDWOOD_LOG = BlocksDreamcatchers.CLOUDWOOD_LOG.get().defaultBlockState();
        protected static final BlockState CLOUDWOOD_LEAVES = BlocksDreamcatchers.CLOUDWOOD_LEAVES.get().defaultBlockState();
    }

    public static final class RuleTests {
        public static final RuleTest NIGHTSTONE = new BlockMatchRuleTest(BlocksDreamcatchers.NIGHTSTONE.get());
    }
}