package com.javaee.features.cdi.injection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.javaee.features.cdi.editor.ImageFileEditor;

@ApplicationScoped
public class SetterInjection {

	private ImageFileEditor imageFileEditor;

	// No-Arg constructor
	public SetterInjection() {
		int i = 0; // debugger trap
	}

	@Inject
	public void setImageFileEditor(ImageFileEditor imageFileEditor) {
		this.imageFileEditor = imageFileEditor;
	}

	public ImageFileEditor getImageFileEditor() {
		return imageFileEditor;
	}
}
