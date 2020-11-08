package com.cenfotec.mongoapi.domain;

public class Professional {



	@Id
	public String id;
	public String name;

	public Professional() {
	}

	public Professional(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Colleague{" + ", name='" + name + '\'' + '}';
	}

	public Professional(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
