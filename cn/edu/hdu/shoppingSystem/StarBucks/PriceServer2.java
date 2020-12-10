package edu.hdu.shoppingSystem.StarBucks;


public class PriceServer2 {
    private BuyStrategy strategy;

    public void setStrategy(BuyStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice() {
        return strategy.getPrice();
    }

    public String getInfo() {
        return strategy.getInfo();
    }
}
