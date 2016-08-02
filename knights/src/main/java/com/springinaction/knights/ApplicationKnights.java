package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationKnights {

	private static final Logger logger = LogManager.getLogger(ApplicationKnights.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		logger.info("Старт приложения...");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

		// ручной вызов метода - получаю бин knight - а какой это класс - это
		// уже определяет XML
		// главное чтоб эти классы реализовывали один и тот-же интерфейс, в
		// данном случае это интерфейс KnightTemplate
		KnightInterface kn = (KnightInterface) context.getBean("knight");
		kn.prn();
		kn.prepareWeapon();
		kn.hit();
		kn.hit();
		kn.hit();
		kn.embarkOnQuest();

	}

}
