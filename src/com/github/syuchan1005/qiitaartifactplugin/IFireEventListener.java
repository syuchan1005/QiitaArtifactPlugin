package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.openapi.extensions.ExtensionPointName;

public interface IFireEventListener {
	ExtensionPointName<IFireEventListener> EP_NAME =
			ExtensionPointName.create("com.github.syuchan1005.qiitaartifactplugin.iFireEventListener");

	void fireEvent();
}
