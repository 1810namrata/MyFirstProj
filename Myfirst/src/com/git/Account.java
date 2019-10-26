package com.git;

public class Account {

	int acno;
	String acname;
	public Account(int acno, String acname) {
		super();
		this.acno = acno;
		this.acname = acname;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", acname=" + acname + "]";
	}
	
	
}
