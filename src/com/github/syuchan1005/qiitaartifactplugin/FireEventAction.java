package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class FireEventAction extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent anActionEvent) {
		for (CFireEventListener listener : CFireEventListener.EP_NAME.getExtensions()) {
			listener.getInstance().fireEvent();
		}
		for (IFireEventListener listener : IFireEventListener.EP_NAME.getExtensions()) {
			listener.fireEvent();
		}
	}
}
