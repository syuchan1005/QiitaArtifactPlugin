package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class NotificationAction extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent event) {
		Notifications.Bus.notify(new Notification("Qiita Artifact", "Title", "Content", NotificationType.INFORMATION));
	}
}
