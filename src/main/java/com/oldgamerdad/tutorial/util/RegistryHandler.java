package com.oldgamerdad.tutorial.util;

import com.oldgamerdad.tutorial.Tutorial;
import com.oldgamerdad.tutorial.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS =  new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // For Items Only
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

}
