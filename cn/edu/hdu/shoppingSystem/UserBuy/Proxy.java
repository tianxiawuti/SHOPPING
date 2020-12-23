package edu.hdu.shoppingSystem.UserBuy;


public class Proxy {
    private StoreFactory storeFactory;
    private String factoryName;

    public Proxy(String factoryName){
        this.factoryName = factoryName;
    }

    public void buy(){
        if(storeFactory==null){
            this.storeFactory = new StoreFactory();
        }
        Store store = storeFactory.getStore(factoryName);
        System.out.println("欢迎光临："+factoryName);
        store.buy();
    }
}
