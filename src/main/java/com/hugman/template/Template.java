package com.hugman.template;

import com.google.common.reflect.Reflection;
import com.hugman.dawn.api.object.ModData;
import com.hugman.template.config.TemplateConfig;
import com.hugman.template.init.TemplateBlockBundle;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Template implements ModInitializer
{
	public static final ModData MOD_DATA = new ModData("%mod_id%");
	public static final Logger LOGGER = LogManager.getLogger();
	public static final TemplateConfig CONFIG = AutoConfig.register(TemplateConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {
		initBundles();
		MOD_DATA.registerCreators();
	}

	public static void initBundle(Class<?> clazz) {
		Reflection.initialize(clazz);
		for(Class<?> clazz2 : clazz.getClasses()) {
			initBundle(clazz2);
		}
	}

	public static void initBundles() {
		initBundle(TemplateBlockBundle.class);
	}
}