package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class KnightDragonKiller extends KnightGeneral {

	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(KnightDragonKiller.class);

	public KnightDragonKiller(String text, WeaponsInterface weapon) {
		super(new Minstrel(), "Рыцарь - охотник на драконов.", text, weapon);
		this.KnightName = "Рыцарь - охотник на драконов.";
	}

	@Override
	public void prepareWeapon() {
		weapon.prepare();
	}

	@Override
	public void hit() {
		weapon.use();
	}

}
