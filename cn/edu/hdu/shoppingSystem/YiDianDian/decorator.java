package edu.hdu.shoppingSystem.YiDianDian;

import java.util.List;
import java.util.Scanner;

public class decorator {
	item addMixture;
	Scanner input=new Scanner(System.in);
	
	void add(List<item> itemList){
		System.out.println("Would you want to add something?pudding?redBean?zhenBoye?");
		String add=input.next();
		switch(add) {
		case "pudding": 	addMixture=new pudding();break;
		case "redBean": 	addMixture=new redBean();break;
		case "zhenBoye":	addMixture=new zhenBoye();break;
		default:
			System.out.println("check your input");
			return;
		}
		itemList.add(addMixture);
	}
}
