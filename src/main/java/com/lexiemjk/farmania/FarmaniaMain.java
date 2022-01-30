package com.lexiemjk.farmania;

import com.lexiemjk.farmania.block.ModBlocks;
import com.lexiemjk.farmania.item.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FarmaniaMain.MODID)
public class FarmaniaMain
{
    public static final String MODID = "farmania";

    public static final Logger LOGGER = LogManager.getLogger();

    public FarmaniaMain() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent e){
        LOGGER.info("PREINIT");
    }

    private void clientSetup(FMLClientSetupEvent e){
        e.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.MAGICAL_WHEAT.get(), RenderType.getCutout());
        });
    }
}
