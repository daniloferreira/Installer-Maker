package com.cavernsf.utils;

/***
 * Application Strings Enum
 * @author Danilo Ferreira
 *
 */
public enum ApplicationBundleKeys {

	FILE("file"),
	EDIT("edit"),
	NEW("new");
	
	private ApplicationBundleKeys(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

	private String key;
}
