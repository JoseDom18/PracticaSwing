package com.mingood.calculadora;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Toolkit screen = Toolkit.getDefaultToolkit();
	private Dimension screenSize = screen.getScreenSize();
	private final int heigth = screenSize.height;
	private final int width = screenSize.width;
	Frame frame = new Frame();
	
	public Marco() {

		setBounds(width / 4, heigth / 4, width / 2 , heigth / 2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(frame);
		setVisible(true);
	}
	

}
