package io.github.fallOut015.dreamcatchers.util;

import io.github.fallOut015.dreamcatchers.MainDreamcatchers;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventsDreamcatchers {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MainDreamcatchers.MODID);



    public static final RegistryObject<SoundEvent> MUSIC_NIGHTMARE = SOUND_EVENTS.register("music_nightmare", () -> new SoundEvent(new ResourceLocation("dreamcatchers", "music.nightmare")));
    public static final RegistryObject<SoundEvent> MUSIC_SKY = SOUND_EVENTS.register("music_sky", () -> new SoundEvent(new ResourceLocation("dreamcatchers", "music.sky")));



    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}