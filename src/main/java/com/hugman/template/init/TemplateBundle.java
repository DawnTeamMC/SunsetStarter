package com.hugman.template.init;

import com.hugman.dawn.api.creator.Creator;
import com.hugman.dawn.api.creator.SimpleCreator;
import com.hugman.template.Template;

public abstract class TemplateBundle
{
	protected static <O, V extends SimpleCreator<O>> O add(V creator) {
		Template.MOD_DATA.addCreator(creator);
		return creator.getValue();
	}

	protected static <V extends Creator> V creator(V creator) {
		Template.MOD_DATA.addCreator(creator);
		return creator;
	}
}