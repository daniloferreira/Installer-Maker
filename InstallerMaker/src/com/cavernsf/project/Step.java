package com.cavernsf.project;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
/**
 * Step configuration
 * @author danilo
 *
 */
public class Step {

	public Step(int i) {
		order = i;
	}
	
	private Map<File, FileVerification> fileVerification;
	
	
	private int order;
	public  static final int FILE = 1;
	public static final int SERVER = 2;
	public void execute() throws Exception {
		if(order == 1) {
			executeFileVerification();
		}
		
	}
	private void executeFileVerification() throws Exception {
		fileVerification = new HashMap<File, FileVerification>();
		FileVerification fv = new FileVerification(new File("resources/bundle"));
		
		Map<Boolean, WarnType> fileexist = new HashMap<Boolean, WarnType>();
		fileexist.put(true, WarnType.HIGH);
		
		fv.setExists(fileexist);
		
		fv.executeFileVerification();
		
	}
	
}
