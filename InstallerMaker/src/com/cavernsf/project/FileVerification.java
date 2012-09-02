package com.cavernsf.project;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

/**
 * File verification settings
 * @author danilo
 *
 */
public class FileVerification {

	public FileVerification(File file) {
		this.file = file;
	}
	private File file;
	private Map<Boolean, WarnType> exists;
	private Map<Boolean, WarnType> isFir;
	private Map<Boolean, WarnType> isFile;
	private Map<Boolean, WarnType> canRead;
	private Map<Boolean, WarnType> canWrite;
	
	
	public void executeFileVerification() throws Exception {
		if(exists != null) {
			for (Entry<Boolean, WarnType> item : exists.entrySet()) {
				if(item.getKey()) {
					switch (item.getValue()) {
					case HIGH:
						throw new Exception();
					case MEDIUM:
						askToCreate();
					default:
						break;
					}
				}
			}
		}
		
	}
	
	private void askToCreate() {
		// TODO Auto-generated method stub
		
	}

	public Map<Boolean, WarnType> getExists() {
		return exists;
	}
	public void setExists(Map<Boolean, WarnType> exists) {
		this.exists = exists;
	}
}
