package com.javaee.features.cdi.editor;

import javax.inject.Inject;

import com.javaee.features.cdi.editor.ImageFileEditor;

/**
 * Created by claudiu.barac on 12/01/2020.
 */
public class ImageFileProcessor {

	private ImageFileEditor imageFileEditor;

	@Inject
	public ImageFileProcessor(ImageFileEditor imageFileEditor) {
		this.imageFileEditor = imageFileEditor;
	}
}
