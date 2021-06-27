package io.github.fallOut015.dreamcatchers.world.gen.surfacebuilders;

import io.github.fallOut015.dreamcatchers.MainDreamcatchers;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SurfaceBuildersDreamcatchers {
    private static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MainDreamcatchers.MODID);



    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> NIGHTMARE = SURFACE_BUILDERS.register("nightmare", () -> new NightmareSurfaceBuilder(SurfaceBuilderConfig.CODEC));
    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> SKY = SURFACE_BUILDERS.register("sky", () -> new SkySurfaceBuilder(SurfaceBuilderConfig.CODEC));



    public static void register(IEventBus bus) {
        SURFACE_BUILDERS.register(bus);
    }
}