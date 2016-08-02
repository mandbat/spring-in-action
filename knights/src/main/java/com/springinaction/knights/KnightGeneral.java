package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class KnightGeneral implements KnightInterface {

	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(KnightGeneral.class);

	// private Minstrel minstrel;
	private String text1;
	private String text2;
	protected WeaponsInterface weapon;
	private QuestInterface quest;
	protected String KnightName;
	protected Minstrel minstrel;

	public KnightGeneral(Minstrel minstrel, String KnightName, String text, WeaponsInterface weapon) {

		System.out.println(KnightName + "\nПроизошел вызов конструктора: " + text);
		this.weapon = weapon;
		this.minstrel = minstrel;

	}

	public QuestInterface getQuest() {
		return quest;
	}

	public void setQuest(QuestInterface quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		// minstrel.singBeforeQuest();
		quest.embark();
		// minstrel.singAfterQuest();
	}

	@Override
	public void setText1(String txt) {
		this.text1 = txt;
	}

	@Override
	public void setText2(String txt) {
		this.text2 = txt;
	}

	@Override
	public void init() {
		System.out.println("Произошел вызов Init: " + text1);
	}

	@Override
	public void prn() {
		System.out.println("Произошел вызов метода: " + text2);
	}

}
