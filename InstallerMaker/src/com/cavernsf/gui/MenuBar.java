package com.cavernsf.gui;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.cavernsf.utils.ApplicationBundleKeys;
import com.cavernsf.utils.ResourceBundle;
/**
 * Menu Bar class
 * @author Danilo Ferreira
 *
 */
public class MenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenu mFile;
	private ResourceBundle bundle;
	
	public MenuBar(ResourceBundle bundle) {
		this.bundle = bundle;
		createMenuBar();
	}
	/**
	 * Create the application menu bar
	 */
	private void createMenuBar() {
		//Instance menu bar
		
		//Instance File's Menu
		mFile = new JMenu(bundle.getMessage(ApplicationBundleKeys.FILE.getKey()));
		JMenuItem itemNew = new JMenuItem(new Action() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("oi");
			}
			
			@Override
			public void setEnabled(boolean arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removePropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void putValue(String arg0, Object arg1) {
				
			}
			
			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object getValue(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addPropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		itemNew.setLabel(bundle.getMessage(ApplicationBundleKeys.NEW.getKey()));
		itemNew.setEnabled(true);
		mFile.add(itemNew);
		this.add(mFile);
	}
}
