package net.eric.teamfortressmc.effect;

import com.mojang.blaze3d.shaders.Effect;
import net.eric.teamfortressmc.TeamFortressMc;
import net.eric.teamfortressmc.effect.custom.RestrictMovementEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
        DeferredRegister.create(ForgeRegistries.MOB_EFFECTS ,TeamFortressMc.MOD_ID);
    private static IForgeRegistry<Effect> Effect;
    public static final RegistryObject<MobEffect> RESTRICT_MOVEMENT =
            EFFECTS.register( "restrict_movement", () -> new RestrictMovementEffect(MobEffectCategory.HARMFUL, 9154528));

}
