package net.eric.teamfortressmc.datagen;

import net.eric.teamfortressmc.TeamFortressMc;
import net.eric.teamfortressmc.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TeamFortressMc.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SANDVICH);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),

                ResourceLocation.tryParse("item/generated")).texture("layer0",

                ResourceLocation.tryBuild(TeamFortressMc.MOD_ID, "item/" + item.getId().getPath()));

    }
}
