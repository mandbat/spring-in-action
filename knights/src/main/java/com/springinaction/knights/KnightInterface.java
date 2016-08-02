package com.springinaction.knights;

public interface KnightInterface {

	public void prn();
	public void init();
	public void hit();
	public void prepareWeapon();
	void setText1(String txt);
	void setText2(String txt);
	public QuestInterface getQuest();
	public void setQuest(QuestInterface quest);
	public void embarkOnQuest();
	
}
