package com.javaee.features.cdi.editor;

import javax.enterprise.inject.Alternative;

@Alternative
public class JpgFileEditor /*implements ImageFileEditor*/ {

	public String openFile(String fileName) {
		return "Opening JPG file " + fileName;
	}

}
