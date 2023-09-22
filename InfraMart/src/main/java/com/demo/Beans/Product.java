package com.demo.Beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int qty;

	@Column(nullable = false)
	private double price;
	
	private String description;
	
	
	private String category;
	
	
	//parameterless constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parametrized constructor
	public Product(String name, int qty, double price, String description,  String category) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.description = description;
		this.category = category;
	}
	
	public Product(int id,String name, int qty, double price, String description,  String category) {
		super();
		this.id=id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	//getter and setter
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	//tostring
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + ", description="
				+ description +  ", category=" + category + "]";
	}
	
	

}
