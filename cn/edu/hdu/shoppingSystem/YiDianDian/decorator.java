package edu.hdu.shoppingSystem.yiDianDian;
import java.util.*;

public class decorator {
    item addMixture;
    Scanner input=new Scanner(System.in);

    void add(List<item> itemList){
        System.out.println("Would you want to add something?");
        String add=input.next();
        switch(add) {
            case "pudding": 	addMixture=new pudding();break;
            case "redBean": 	addMixture=new redBean();break;
            case "zhenBoye":	addMixture=new zhenBoye();break;
        }
        itemList.add(addMixture);
    }
}