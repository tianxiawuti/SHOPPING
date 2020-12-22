package edu.hdu.shoppingSystem.yiDianDian;
import java.util.*;

public class yiDianDian {
    public List <item> itemList=new ArrayList<>();
    priceServer aServer=new priceServer();
    decorator ADecorator=new decorator();

    Scanner input=new Scanner(System.in);
    void buy(String Add) {
        System.out.println("would you want a cup of milkTea?\nHow about the temperature and how sweet is it?");
        double temperature=input.nextDouble();
        int sugar=input.nextInt();
        milkTea ACupOfMilkTea=new milkTea(temperature,sugar);

        ADecorator.add(itemList);

        System.out.println("The price is"+aServer.countPrice(ACupOfMilkTea, itemList));
    }
}