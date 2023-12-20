package com.kn.daemonThread;

public class DaemonThreadDemo {

	public static void main(String[] args) {

		Typing t = new Typing();
		Compilation c = new Compilation();
		Saving s = new Saving();
		t.start();
		c.setDaemon(true);
		s.setDaemon(true);
		c.start();
		s.start();
	}

}
