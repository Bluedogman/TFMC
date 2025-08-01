package net.eric.teamfortressmc.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class RestrictMovementEffect extends MobEffect {
    public RestrictMovementEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level().isClientSide()) {
            pLivingEntity.setJumping(false);
        }
    }
    @Override
    public  boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
