package edu.hdu.shoppingSystem.StarBucks;


public class BuyMilk implements BuyStrategy{
    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "牛奶";
    }
}
