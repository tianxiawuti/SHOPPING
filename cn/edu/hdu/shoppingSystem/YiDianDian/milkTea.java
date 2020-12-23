package edu.hdu.shoppingSystem.YiDianDian;

public class milkTea {
	private double temperature;
	private int sugar;
	private String name;
	private double price;
	milkTea(double temperature,int sugar){
		this.price=10;
		this.sugar=sugar;
		this.temperature=temperature;
		this.name="milkTea";
	}
	double getPrice(){
		return this.price;
	}
}
