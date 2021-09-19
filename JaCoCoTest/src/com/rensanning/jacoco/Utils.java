package com.rensanning.jacoco;

import com.rensanning.jacoco.bean.People;

public class Utils {

	public static String getPeopleAge(People p) {
		if (p.getAge() >= 20 && p.getAge() <= 29) {
			return "20";
		}
		if (p.getAge() >= 30 && p.getAge() <= 39) {
			return "30";
		}
		if (p.getAge() >= 40 && p.getAge() <= 49) {
			return "40";
		}
		return "";
	}
}
