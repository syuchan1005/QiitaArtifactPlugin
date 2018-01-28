package com.github.syuchan1005.qiitaartifactplugin;

import com.intellij.openapi.fileEditor.impl.EditorTabColorProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.JBColor;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TabColorExtensionImpl implements EditorTabColorProvider {
	@Nullable
	@Override
	public Color getEditorTabColor(@NotNull Project project, @NotNull VirtualFile virtualFile) {
		switch (virtualFile.getFileType().getDefaultExtension()) {
			case "txt":
				return JBColor.GREEN;
			case "xml":
				return JBColor.BLUE;
			case "java":
				return JBColor.YELLOW;
			default:
				return null;
		}
	}
}
