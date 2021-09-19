package com.rensanning.jacoco;

import com.rensanning.jacoco.bean.People;

public class SampleTest {

	public static void main(String[] args) {

		People p = new People();
		p.setAge(25);
		
		System.out.println(Utils.getPeopleAge(p));
		
		p = new People();
		p.setAge(36);
		
		System.out.println(Utils.getPeopleAge(p));
		
	}

}
