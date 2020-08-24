package com.oldgamerdad.tutorial.util;

import com.oldgamerdad.tutorial.Tutorial;
import com.oldgamerdad.tutorial.armor.ModArmorMaterial;
import com.oldgamerdad.tutorial.blocks.BlockItemBase;
import com.oldgamerdad.tutorial.blocks.RubyBlock;
import com.oldgamerdad.tutorial.blocks.RubyOre;
import com.oldgamerdad.tutorial.items.ItemBase;
import com.oldgamerdad.tutorial.items.PoisonApple;
import com.oldgamerdad.tutorial.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS   =  DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // For Items Only
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

    // For Tools Only
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 2, -2.4f, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 2, -2.6f, new Item.Properties().group(Tutorial.TAB)));

    // For Armor Only
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));

    // For Blocks Only
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // For Block Items Only
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));

}
