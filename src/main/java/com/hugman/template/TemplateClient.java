package com.hugman.template;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TemplateClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		/**
		 * Register color maps, entity model layers, and entity renders here.
		 */
	}
}
