package com.springinaction.springidol;

public class Ticket {

	private int id;

	public int getId() {
		return id;
	}

	private Ticket() {
		id = hashCode();
		System.out.println(id);
	}

}
