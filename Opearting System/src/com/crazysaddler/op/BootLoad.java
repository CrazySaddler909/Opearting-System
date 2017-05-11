package com.crazysaddler.op;

import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BootLoad extends Canvas {

	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	private static JLabel label;

	public static void main(String[] args) {
		frame = new JFrame();

		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel();
		label.setText("System loading");
	}

}
