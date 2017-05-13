package com.crazysaddler.op.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Action1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Logged in");
		JFrame frame = new JFrame("Desktop");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
