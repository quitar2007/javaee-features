package com.javaee.features.cdi.editor;

import javax.enterprise.inject.Alternative;

@Alternative
public class PngFileEditor /*implements ImageFileEditor*/ {

	public String openFile(String fileName) {
		return "Opening PNG file " + fileName;
	}

}
