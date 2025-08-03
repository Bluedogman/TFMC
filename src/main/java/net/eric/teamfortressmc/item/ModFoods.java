package net.eric.teamfortressmc.item;

import net.eric.teamfortressmc.effect.ModEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public class ModFoods {
    static class Sandvich extends Item {
        public static final FoodProperties SANDVICH = new FoodProperties.Builder().nutrition(2).fast()
                .saturationMod(0.2f)
                //.effect(() -> new MobEffectInstance(ModEffects.RESTRICT_MOVEMENT.get(), 80, 255), 1) NOT NEEDED
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 80, 128, true, false, false), 1)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, true, false, false), 1)
                .build();

        public Sandvich(Properties pProperties) {
            super(pProperties);
        }

        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.teamfortressmc.sandvich.tooltip"));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
        
    }

