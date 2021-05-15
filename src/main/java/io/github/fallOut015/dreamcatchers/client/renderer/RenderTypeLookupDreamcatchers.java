package io.github.fallOut015.dreamcatchers.client.renderer;

import io.github.fallOut015.dreamcatchers.block.BlocksDreamcatchers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RenderTypeLookupDreamcatchers {
    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.CHAOTIC_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.CLOUDY_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.COLORFUL_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.FORTUITOUS_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.LUCKY_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.MISCHIEVOUS_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.NIGHTMARISH_DREAMCATCHER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.REJUVENATING_DREAMCATCHER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.GHOSTWOOD_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksDreamcatchers.CLOUDWOOD_SAPLING.get(), RenderType.cutout());
    }
}