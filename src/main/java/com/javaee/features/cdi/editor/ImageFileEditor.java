package com.javaee.features.cdi.editor;

/**
 * Created by claudiu.barac on 12/01/2020.
 */
public interface ImageFileEditor {
	String openFile(String fileName);

	String editFile(String fileName);

	String writeFile(String fileName);

	String saveFile(String fileName);
}
