package com.springinaction.knights;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Minstrel {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(Minstrel.class);

	public void singBeforeQuest() { // Вызывается перед выполнением задания
		System.out.println("Fa la la; The knight is so brave!");
	}

	public void singAfterQuest() { // Вызывается после выполнения задания
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}

}
