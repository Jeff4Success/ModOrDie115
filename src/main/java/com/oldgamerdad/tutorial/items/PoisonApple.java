package com.oldgamerdad.tutorial.items;

import com.oldgamerdad.tutorial.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class PoisonApple extends Item {
    public PoisonApple() {
        super(new Item.Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                                .hunger(4)
                                .saturation(1.2F)
                                .effect(new EffectInstance(Effects.NAUSEA, 300, 0), 1)
                                .effect(new EffectInstance(Effects.POISON, 300, 111), 1)
                                .effect(new EffectInstance(Effects.HUNGER, 300, 0), 0.3F)
                                .setAlwaysEdible()
                                .build())




        );
    }
}
