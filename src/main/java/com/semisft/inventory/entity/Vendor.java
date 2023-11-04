package com.semisft.inventory.entity;

public class Vendor extends BaseId {
	private String name;
	private String description;

	// Constructor, getters and setters
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
