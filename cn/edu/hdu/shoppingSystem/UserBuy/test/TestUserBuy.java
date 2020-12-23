package edu.hdu.shoppingSystem.UserBuy.test;


import edu.hdu.shoppingSystem.UserBuy.Proxy;
import org.junit.Test;

import java.util.Scanner;

public class TestUserBuy {

    @Test
    public void test(){
        Proxy proxy = new Proxy();
        String storeName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商店名称：Yidiandian 或 Starbucks(输入-1退出程序)");
        while(!(storeName = scanner.nextLine()).equals("-1")){
            proxy.setFactoryName(storeName);
            System.out.println("**********");
            System.out.println("请输入商店名称：Yidiandian 或 Starbucks(输入-1退出程序)");
        }
        scanner.close();
    }
}
