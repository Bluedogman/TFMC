package net.eric.teamfortressmc.datagen;

import net.eric.teamfortressmc.TeamFortressMc;
import net.eric.teamfortressmc.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, TeamFortressMc.MOD_ID, exFileHelper);
    }


    @Override
    protected void registerStatesAndModels(){
    blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
    blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
    blockWithItem(ModBlocks.SAPPHIRE_ORE);
    blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
