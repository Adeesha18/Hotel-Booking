package com.rcb.PersonDetails;

public abstract class PersonImpliment implements Person {
	String name;
	long mob;

	PersonImpliment(String name, long mob) {
		this.name = name;
		this.mob = mob;
	}

}
