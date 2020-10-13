package com.javaee.features.cdi.editor;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GifFileEditor implements ImageFileEditor {

	public String openFile(String fileName) {
		return "Opening GIF file " + fileName;
	}

}
