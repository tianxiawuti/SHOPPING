package edu.hdu.shoppingSystem.StarBucks;


public class StarBucks {
    //just test
    private static final String BASIC_NAME = "普通咖啡 ";
    private static final double BASIC_PRICE = 20;

    public void buy(BuyStrategy... strategies){
        PriceServer2 server = new PriceServer2();
        String buyInfo = BASIC_NAME;
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
