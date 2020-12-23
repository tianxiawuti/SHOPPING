package edu.hdu.shoppingSystem.UserBuy;


public class Proxy {
    private StoreFactory storeFactory;
    private String factoryName;

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void buy(){
        if(storeFactory==null){
            this.storeFactory = new StoreFactory();
        }
        Store store = storeFactory.getStore(factoryName);
        if(store == null){
            System.out.println("error：请检查输入的商店名称");
            return;
        }
        System.out.println("欢迎光临："+factoryName);
        store.buy();
    }
}

