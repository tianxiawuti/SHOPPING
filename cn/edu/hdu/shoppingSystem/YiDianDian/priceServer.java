package edu.hdu.shoppingSystem.yiDianDian;
import java.util.*;

public class priceServer {
    private double sumPrice;
    double countPrice(milkTea AmilkTea,List<item> itemList) {
        sumPrice=AmilkTea.getPrice();
        for(item x:itemList) {
            sumPrice+=x.getPrice();
        }
        return sumPrice;
    }
}
