package com.crazysaddler.op.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.crazysaddler.op.fileexplorer.FileExplorer;

public class Action3 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		new FileExplorer();
	}

}
