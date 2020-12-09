package edu.hdu.shoppingSystem.StarBucks;


public class BuyEspresso implements BuyStrategy{
    @Override
    public double getPrice() {
        return 4;
    }

    @Override
    public String getInfo() {
        return "浓缩";
    }
}
