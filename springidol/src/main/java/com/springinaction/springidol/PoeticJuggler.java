package com.springinaction.springidol;

public class PoeticJuggler extends Juggler {

	private Poem poem;
	private Ticket ticket;

	public PoeticJuggler(Poem poem) { // Внедрение поэмы
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) { // Внедрение количества
		super(beanBags); // мячиков и поэмы
		this.poem = poem;
	}

	public void perform() {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
