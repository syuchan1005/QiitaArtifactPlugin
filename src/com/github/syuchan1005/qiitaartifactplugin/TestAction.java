package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class TestAction extends AnAction {
	public TestAction() {
		super("Test Action");
	}

	@Override
	public void actionPerformed(AnActionEvent event) {
		Messages.showMessageDialog(event.getProject(), "Clicked!", "Fire Action", Messages.getInformationIcon());
	}
}
