package com.ecomservices.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_master")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int id;

	@Column(name = "item_name")
	private String name;

	@Column(name = "item_description")
	private String description;

	@Column(name = "item_short_description")
	private String shortDescription;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String name, String description, String shortDescription) {
		super();
		this.name = name;
		this.description = description;
		this.shortDescription = shortDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", shortDescription="
				+ shortDescription + "]";
	}
}
