package com.crazysaddler.op.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.crazysaddler.op.turtleshell.TurtleShell;

public class Action2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		new TurtleShell();
	}

}
