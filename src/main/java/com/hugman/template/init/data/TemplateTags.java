package com.hugman.template.init.data;

import com.hugman.template.Template;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class TemplateTags
{
	public static class Blocks
	{
		public static final TagKey<Block> TEMPLATE_BLOCKS = register("template_blocks");

		private static TagKey<Block> register(String name) {
			return TagKey.of(Registry.BLOCK_KEY, Template.MOD_DATA.id(name));
		}
	}
}
