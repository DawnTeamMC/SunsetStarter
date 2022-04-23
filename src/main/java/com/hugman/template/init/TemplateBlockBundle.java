package com.hugman.template.init;

import com.hugman.dawn.api.creator.BlockCreator;
import com.hugman.template.object.block.TemplateBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class TemplateBlockBundle extends TemplateBundle
{
	public static final Block TEMPLATE_BLOCK = add(new BlockCreator.Builder("template_block", TemplateBlock::new, FabricBlockSettings.copyOf(Blocks.STONE)).build());
}
