package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WeaponBow implements WeaponsInterface {

	private static final Logger logger = LogManager.getLogger(WeaponBow.class);
	
	private String weaponType;
	private int arrowCount;
	
	public WeaponBow() {
		logger.info("Вызов конструктора");
		weaponType = "Bow";
	}

	
	public void setArrowCount(int arrowCount) {
		this.arrowCount = arrowCount;
	}

	@Override
	public void use() {
		System.out.println("Выстрелил из лука. Осталось стрел: " + --arrowCount);
	}

	@Override
	public void prepare() {
		System.out.println("Зарядил стрелы. Количество: " + arrowCount);
	}

	@Override
	public String getType() {
		return weaponType;
	}

}
