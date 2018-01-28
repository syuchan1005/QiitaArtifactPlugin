package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.util.xmlb.annotations.Attribute;
import java.lang.reflect.Constructor;

public class CFireEventListener {
	public static final ExtensionPointName<CFireEventListener> EP_NAME =
			ExtensionPointName.create("com.github.syuchan1005.qiitaartifactplugin.cFireEventListener");

	@Attribute("implementationClass")
	private String implementationClass;

	public CFireEventListener() {}

	public void fireEvent() {}

	protected CFireEventListener getInstance() {
		try {
			Class<?> clazz = Class.forName(implementationClass);
			return (CFireEventListener) clazz.getConstructor().newInstance();
		} catch (ReflectiveOperationException e) {
			return null;
		}
	}
}
