package net.eric.teamfortressmc;

import com.mojang.logging.LogUtils;
import net.eric.teamfortressmc.block.ModBlocks;
import net.eric.teamfortressmc.item.ModCreativeModeTabs;
import net.eric.teamfortressmc.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TeamFortressMc.MOD_ID)
public class TeamFortressMc
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "teamfortressmc"; //LOOK HERE FOR MOD_ID
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public TeamFortressMc(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModBlocks.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        //if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        //    event.accept(ModItems.SAPPHIRE);
        //    event.accept(ModItems.RAW_SAPPHIRE);
        //}
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
