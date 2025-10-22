package com.mingood.calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Frame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton result = new JButton();
	JPanel frame2;

	public Frame() {
		setLayout(new BorderLayout());
		result.setEnabled(false);
		add(result, BorderLayout.NORTH);
		result.setText("0");

		frame2 = new JPanel();
		frame2.setLayout(new GridLayout(4 , 5));
		putButton("7");
		putButton("8");
		putButton("9");
		putButton("DEL");
		putButton("AC");
		putButton("4");
		putButton("5");
		putButton("6");
		putButton("*");
		putButton("/");
		putButton("1");
		putButton("2");
		putButton("3");
		putButton("=");
		putButton("-");
		putButton("0");
		putButton(".");
		putButton("x10");
		putButton("Ans");
		putButton("=");
		add(frame2, BorderLayout.CENTER);
		
	}

	private void putButton (String r) {
		
		JButton button = new JButton(r);
		
		button.addActionListener(e -> {
			
			result.setText(result.getText() + e.getActionCommand());
			
		});
		
		frame2.add(button);
	}

	
}
