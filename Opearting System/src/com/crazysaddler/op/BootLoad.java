package com.crazysaddler.op;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.crazysaddler.op.actions.Action1;

public class BootLoad extends JFrame {

	private static final long serialVersionUID = 1L;
	static int interval;
	static Timer timer;

	public BootLoad() throws HeadlessException {
		System.out.println("constructor");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel panel = new JPanel();
		add(panel);
		JButton button = new JButton("Login");
		panel.add(button);
		button.addActionListener(new Action1());

		
		JTextField username = new JTextField("UserName", 50);
		JTextField password = new JTextField("Password", 50);
		

		getContentPane().add(username);
		getContentPane().add(password);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Input seconds => : ");
		String secs = sc.nextLine();
		int delay = 1000;
		int period = 1000;
		timer = new Timer();
		interval = Integer.parseInt(secs);
		System.out.println(secs);
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				System.out.println(setInterval());

			}
		}, delay, period);
	}

	private static final int setInterval() {
		if (interval == 1) {
			timer.cancel();
			System.out.println("Timer ened");
			// User Login JFrame
			// JFrame frame1 = new JFrame();
			// frame1.setVisible(true);
			// frame1.setSize(800, 600);
			// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame1.setTitle("User Login");
			// frame1.setLocationRelativeTo(null);
		}
		return --interval;

	}

	public static void main(String[] args) {

		System.out.println("Main");
		new BootLoad().setVisible(true);
	}

}
