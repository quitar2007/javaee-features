package com.javaee.features.cdi.injection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.javaee.features.cdi.editor.ImageFileEditor;


/**
 * Constructor injection
 */
@ApplicationScoped
public class ConstructorInjection {

	private ImageFileEditor imageFileEditor;

	public ConstructorInjection() {
		int i = 0; // debugger trap
	}

	@Inject
	public ConstructorInjection(ImageFileEditor imageFileEditor) {
		this.imageFileEditor = imageFileEditor;
	}

	public ImageFileEditor getImageFileEditor() {
		return imageFileEditor;
	}

}
