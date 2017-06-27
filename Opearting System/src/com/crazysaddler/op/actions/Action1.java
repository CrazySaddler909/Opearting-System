package com.crazysaddler.op.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Action1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Logged in");
		JFrame frame = new JFrame("Desktop");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		frame.add(panel1);
		JButton button1 = new JButton("Turtle Shell");
		panel1.add(button1);
		button1.addActionListener(new Action2());
		
//		JPanel panel2 = new JPanel();
//		frame.add(panel2);
//		JButton button2 = new JButton("File explorer");
//		panel1.add(button2);
//		button1.addActionListener(new Action3());


	}
	
}
