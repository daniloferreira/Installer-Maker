package com.cavernsf.utils;

import java.io.File;

/**
 * Message validator provider
 * 
 * @author Danilo Ferreira
 */
public final class MessageUtils {

	/**
	 * Verify is the file exist if not return 
	 * do not exist message
	 * @param file to be verified
	 * @return Return the validation message
	 * null if file exist.
	 */
	public String fileNotFound(File file) {
		if(file != null) {
			if(!file.exists()) {
				return "File do not exist";
			}
		}
		return null;
	}
}
