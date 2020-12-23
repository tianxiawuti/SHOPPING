package edu.hdu.shoppingSystem.StarBucks;


import edu.hdu.shoppingSystem.UserBuy.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarBucks implements Store {
    //just test
    private static final String BASIC_INFO = "普通咖啡 ";
    private static final double BASIC_PRICE = 20;

    @Override
    public void buy(){
        List<BuyStrategy> strategies = new ArrayList<>();
        String input = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("除了一杯20元的普通咖啡，您还需要来点什么?");
        System.out.println("latte   milk    sugar   espresso");
        System.out.print("输入-1退出:");
        while(!(input = scanner.nextLine()).equals("-1")){
            switch (input){
                case "latte":strategies.add(new BuyLatte());break;
                case "milk":strategies.add(new BuyMilk());break;
                case "sugar":strategies.add(new BuySugar());break;
                case "espresso":strategies.add(new BuyEspresso());break;
                default:
                    System.out.println("请输入正确配料");
                    break;
            }
            System.out.println("latte   milk    sugar   espresso");
            System.out.print("输入-1退出:");
        }

        PriceServer2 server = new PriceServer2();
        String buyInfo = BASIC_INFO;
        double totalPrice = BASIC_PRICE;
        for(BuyStrategy strategy:strategies){
            String info = strategy.getInfo();
            buyInfo = buyInfo + " " +info;
            double price = strategy.getPrice();
            totalPrice += price;
        }
        System.out.println("购买的商品信息:"+buyInfo);
        System.out.println("总金额:"+totalPrice);
    }
}