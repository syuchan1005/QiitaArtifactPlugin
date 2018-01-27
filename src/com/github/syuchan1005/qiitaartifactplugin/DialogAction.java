package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class DialogAction extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent event) {
		String name = Messages.showInputDialog("What's your name?", "Ask Name", AllIcons.General.QuestionDialog);
		Messages.showMessageDialog("Hello, " + name + ". I'll help you.", "Greeting", Messages.getInformationIcon());
	}
}
