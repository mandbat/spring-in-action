package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class KnightDamselRescuing extends KnightGeneral {

	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(KnightDamselRescuing.class);

	public KnightDamselRescuing(String text, WeaponsInterface weapon) {
		super(new Minstrel(), "Рыцарь - спаситель принцесс.", text, weapon);
		this.KnightName = "Рыцарь - спаситель принцесс.";
	}

	public void prepareWeapon() {
		if (weapon.getType().equals("Knife")) {
			System.out.println("Я не умею пользоватьс¤ ножом!");
		} else {
			weapon.prepare();
		}
	}

	public void hit() {
		if (weapon.getType().equals("Knife")) {
			System.out.println("я не умею пользоватьс¤ ножом!");
		} else {
			weapon.use();
		}
	}

}
