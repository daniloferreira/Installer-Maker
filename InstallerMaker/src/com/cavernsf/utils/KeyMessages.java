package com.cavernsf.utils;

/**
 * Key messages
 * @author Danilo Ferreira
 *
 */
public enum KeyMessages {

	FILE_NOT_FOUND("fileNotFound");
	
	private KeyMessages(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

	private String key;
}
