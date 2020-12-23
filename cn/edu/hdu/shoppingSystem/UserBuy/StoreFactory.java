package edu.hdu.shoppingSystem.UserBuy;


import cn.edu.hdu.shoppingSystem.StarBucks.StarBucks;
import cn.edu.hdu.shoppingSystem.Yidiandian.yiDianDian;

public class StoreFactory {
    //使用 getStore 方法获取商店类型的对象
    public Store getStore(String StoreType){
        if(StoreType == null){
            return null;
        }
        if(StoreType.equalsIgnoreCase("Yidiandian")){
            return new yiDianDian();
        } else if(StoreType.equalsIgnoreCase("Starbucks")){
            return new StarBucks();
        }
        return null;
    }
}
