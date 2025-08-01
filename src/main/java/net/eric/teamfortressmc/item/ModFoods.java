package net.eric.teamfortressmc.item;

import net.eric.teamfortressmc.effect.ModEffects;
import net.eric.teamfortressmc.effect.custom.RestrictMovementEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SANDVICH = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.RESTRICT_MOVEMENT.get(), 80, 255), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, true, false, false), 1)
            .build();
}
