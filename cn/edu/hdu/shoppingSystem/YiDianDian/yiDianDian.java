package edu.hdu.shoppingSystem.YiDianDian;

import edu.hdu.shoppingSystem.UserBuy.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yiDianDian implements Store {
	public List <item> itemList=new ArrayList<>();
	priceServer aServer=new priceServer();
	decorator ADecorator=new decorator();
	
	Scanner input=new Scanner(System.in);
	@Override
	public void buy() {
		System.out.println("would you want a cup of milkTea?\nHow about the temperature and how sweet is it?");
		double temperature=input.nextDouble();
		int sugar=input.nextInt();
		milkTea ACupOfMilkTea=new milkTea(temperature,sugar);
		
		ADecorator.add(itemList);
		
		System.out.println("The price is"+aServer.countPrice(ACupOfMilkTea, itemList));
	}
}
