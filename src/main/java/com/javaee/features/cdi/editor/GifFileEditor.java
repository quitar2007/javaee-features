package com.javaee.features.cdi.editor;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@ApplicationScoped
public class GifFileEditor implements ImageFileEditor {

	public String openFile(String fileName) {
		return "Opening GIF file " + fileName;
	}

}
