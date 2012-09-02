package com.cavernsf;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JFrame;

import com.cavernsf.gui.MenuBar;
import com.cavernsf.project.ProjectXML;
import com.cavernsf.utils.ResourceBundle;

/**
 * Main class
 * @author Danilo Ferreira
 * Cavern Software Factory
 */
public class InstallerMaker {

	private static JFrame frame;
	private static MenuBar menuBar;
	private static Container containerPane;
	private static ResourceBundle bundle;
	
	
	
	public static void main(String[] args) throws IOException {
		bundle = new ResourceBundle();
		menuBar = new MenuBar(bundle);
		frame = new JFrame(title);
		frame.setSize(600, 400);
		containerPane = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		containerPane.add(menuBar, BorderLayout.PAGE_START);
		new ProjectXML().save();
		containerPane.setVisible(true);
	}
	
	
	
	private static final String  title = "Installer Maker";
}
