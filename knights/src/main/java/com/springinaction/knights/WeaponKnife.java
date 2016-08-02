package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WeaponKnife implements WeaponsInterface {

	private static final Logger logger = LogManager.getLogger(WeaponKnife.class);
	
	private String weaponType;

	public WeaponKnife() {
		logger.info("Вызов конструктора");
		weaponType = "Knife";
	}

	@Override
	public void use() {
		System.out.println("Ударил ножом!");
	}

	@Override
	public void prepare() {
		System.out.println("Наточил нож.");
	}

	@Override
	public String getType() {
		return weaponType;
	}

}
