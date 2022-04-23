package com.hugman.template.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "%mod_id%")
@Config.Gui.Background("minecraft:textures/block/orange_concrete.png")
public class TemplateConfig implements ConfigData
{
	@ConfigEntry.BoundedDiscrete(min = 1, max = 64)
	public int items_per_click = 3;
}