package io.github.fallOut015.dreamcatchers;

import io.github.fallOut015.dreamcatchers.block.BlocksDreamcatchers;
import io.github.fallOut015.dreamcatchers.block.DreamcatcherBlock;
import io.github.fallOut015.dreamcatchers.client.renderer.RenderTypeLookupDreamcatchers;
import io.github.fallOut015.dreamcatchers.item.ItemsDreamcatchers;
import io.github.fallOut015.dreamcatchers.util.SoundEventsDreamcatchers;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MainDreamcatchers.MODID)
public class MainDreamcatchers {
    public static final String MODID = "dreamcatchers";

    public MainDreamcatchers() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);

        BlocksDreamcatchers.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemsDreamcatchers.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundEventsDreamcatchers.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookupDreamcatchers.doClientStuff(event);
    }
    private void enqueueIMC(final InterModEnqueueEvent event) {
    }
    private void processIMC(final InterModProcessEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber
    public static class Events {
        @SubscribeEvent
        public static void onPlayerWakeUp(final PlayerWakeUpEvent playerWakeUpEvent) {
            if(playerWakeUpEvent.getPlayer().getSleepingPos().isPresent()) {
                boolean isOverworld = playerWakeUpEvent.getPlayer().level.dimension() == World.OVERWORLD;
                boolean hasDreamcatcher = playerWakeUpEvent.getPlayer().level.getBlockState(playerWakeUpEvent.getPlayer().getSleepingPos().get().above()).getBlock() instanceof DreamcatcherBlock;
                boolean successfulSleep = playerWakeUpEvent.getPlayer().level.getDayTime() == 24000;
                if(successfulSleep && isOverworld && hasDreamcatcher) {
                    ((DreamcatcherBlock) playerWakeUpEvent.getPlayer().level.getBlockState(playerWakeUpEvent.getPlayer().getSleepingPos().get().above()).getBlock()).onPlayerWakeUp(playerWakeUpEvent);
                }
            }
        }
    }
}