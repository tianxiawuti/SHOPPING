package edu.hdu.shoppingSystem.StarBucks;


public class BuyLatte implements BuyStrategy{
    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "拿铁";
    }
}
