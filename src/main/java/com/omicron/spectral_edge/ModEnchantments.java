package com.omicron.spectral_edge;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SpectralEdgeMod.MODID)
public class ModEnchantments {
    public static final Enchantment SPECTRAL_EDGE = new SpectralEdge().setRegistryName(SpectralEdgeMod.MODID, "spectral_edge");

    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event)
    {
        event.getRegistry().register(SPECTRAL_EDGE);
        //System.out.println("enchantment_test");
    }
}
