package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;

public class CFireEventListenerImpl extends CFireEventListener {
	@Override
	public void fireEvent() {
		Notifications.Bus.notify(new Notification("Qiita Artifact", "Fire Event", "Class", NotificationType.INFORMATION));
	}
}
