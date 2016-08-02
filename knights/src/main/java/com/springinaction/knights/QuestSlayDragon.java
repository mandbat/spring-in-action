package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class QuestSlayDragon implements QuestInterface {

	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(QuestSlayDragon.class);
	
	private String clich;

	@Override
	public void embark() {
		System.out.println(clich);
	}

	QuestSlayDragon(String clich) {
		this.clich = clich;
	}
}
