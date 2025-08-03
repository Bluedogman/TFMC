package net.eric.teamfortressmc.effect.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.apache.http.annotation.Contract;
import org.jetbrains.annotations.NotNull;

public class RestrictMovementEffect extends MobEffect {
    private static Vec3 ENTITY_POS = null;

    public RestrictMovementEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level().isClientSide()) {

        }
    }
    @Override
    public  boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
