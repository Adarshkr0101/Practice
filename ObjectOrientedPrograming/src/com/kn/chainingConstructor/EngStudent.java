package com.kn.chainingConstructor;

public class EngStudent extends Student {
	int semid;
	String branch;
	public EngStudent() {
		super();
	}
	public EngStudent(int semid, String branch) {
		super();
		this.semid = semid;
		this.branch = branch;
	}
	public EngStudent(int semid) {
		super();
		this.semid = semid;
	}
	public EngStudent(String branch) {
		super();
		this.branch = branch;
	}
	
	

}
