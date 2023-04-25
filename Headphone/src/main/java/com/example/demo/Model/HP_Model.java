package com.example.demo.Model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class HP_Model {
	@Id
//	@GeneratedValue
	public int hp_id;
	public String brand;	
	public String model_Name;
	public String price;
	public String colour;
	public String hp_Type;
	public String water_Resistant;
	public String battery_life;
	public String weight;
	public int latentcy;
	public int getHp_id() {
		return hp_id;
	}
	public void setHp_id(int hp_id) {
		this.hp_id = hp_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel_Name() {
		return model_Name;
	}
	public void setModel_Name(String model_Name) {
		this.model_Name = model_Name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getHp_Type() {
		return hp_Type;
	}
	public void setHp_Type(String hp_Type) {
		this.hp_Type = hp_Type;
	}
	public String getWater_Resistant() {
		return water_Resistant;
	}
	public void setWater_Resistant(String water_Resistant) {
		this.water_Resistant = water_Resistant;
	}
	public String getBattery_life() {
		return battery_life;
	}
	public void setBattery_life(String battery_life) {
		this.battery_life = battery_life;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getLatentcy() {
		return latentcy;
	}
	public void setLatentcy(int latentcy) {
		this.latentcy = latentcy;
	}

	
}

