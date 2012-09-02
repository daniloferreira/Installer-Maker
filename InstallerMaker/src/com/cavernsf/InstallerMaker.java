package com.cavernsf;

import com.cavernsf.utils.KeyMessages;
import com.cavernsf.utils.ResourceBundle;

/**
 * 
 * @author Danilo Ferreira
 *
 */
public class InstallerMaker {

	private static ResourceBundle bundle;
	
	public static void main(String[] args) {
		bundle = new ResourceBundle();
		System.out.println(bundle.getMessage(KeyMessages.FILE_NOT_FOUND.getKey()));
	}
}
