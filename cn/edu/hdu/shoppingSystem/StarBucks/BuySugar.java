package edu.hdu.shoppingSystem.StarBucks;


public class BuySugar implements BuyStrategy{
    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getInfo() {
        return "糖";
    }
}
