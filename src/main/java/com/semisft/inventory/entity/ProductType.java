package com.semisft.inventory.entity;

public class ProductType extends BaseId {
	private String name;

	public ProductType() {
		super();
	}

	public ProductType(Long id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
