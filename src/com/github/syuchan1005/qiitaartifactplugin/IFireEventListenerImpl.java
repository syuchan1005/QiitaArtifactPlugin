package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;

public class IFireEventListenerImpl implements IFireEventListener {
	@Override
	public void fireEvent() {
		Notifications.Bus.notify(new Notification("Qiita Artifact", "Fire Event", "Interface", NotificationType.INFORMATION));
	}
}
