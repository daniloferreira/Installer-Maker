package com.cavernsf.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;
/**
 * Resource Bundle
 * @author Danilo Ferreira
 *
 */
public final class ResourceBundle {

	private File dir = new File("resources/bundle");
	private Properties bundle;
	private  Locale installerLocale;
	private File file;
	
	public ResourceBundle() {
		init();
		loadBundle();
	}
	
	public ResourceBundle(Locale locale) {
		
	}
	/**
	 * Load  default bundle
	 */
	public void init () {
		try {
			if(dir.isDirectory()) {
				if(dir.listFiles().length > 0) {
					file = dir.listFiles()[0];
					installerLocale = new Locale(file.getName());
				}
			}
		} catch (Exception e) {
			System.out.println("Não foi possivel carregar o bundle");
		}
	}
	
	/**
	 * Change de locale of messages
	 * @param langague
	 */
	public void changeBundle(String langague) {
		try {
			if(dir.isDirectory()) {
				for (File item : dir.listFiles()) {
					if(item.getName() == langague) {
						file = item;
						installerLocale = new Locale(langague);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Não foi possivel carregar o bundle (langague)");
		}
	}
	
	
	public void init(Locale locale) {
		installerLocale = locale;
		if(dir.listFiles().length > 0) {
			for (File item : dir.listFiles()) {
				if(item.getName() == locale.getDisplayCountry()) {
					file = item;
					loadBundle();
				}
			}
		}
	}
	
	
	/**
	 * Loads the bundle
	 */
	public void loadBundle () {
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader pw = new InputStreamReader(fis);
			bundle = new Properties();
			bundle.load(pw);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível carregar bundle: Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Não foi possível carregar bundle: Arquivo não encontrado");
		}
	}
	
	/**
	 * Return a value of a key 
	 * @param key 
	 * @return Return the message, return null if not found
	 */
	public String getMessage(String key) {
		String value = null;
		if(bundle != null) {
			value = bundle.getProperty(key);
		}
		if(value == null) {
			System.out.println("Key '"+ key +"' was not found");
			return null;
		}
		return value;
	}
}
