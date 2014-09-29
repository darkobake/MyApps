package com.trax.chap3_minimizeXMLConfig.ioc.normalClasses;

import com.trax.chap3_minimizeXMLConfig.ioc.interfaces.CoffeeShop;


import javax.inject.Inject;

import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class CoffeeBarMenu {

    private Set<CoffeeShop> coffeeShopsProviderSet;

    @Inject
    public CoffeeBarMenu(Provider<CoffeeShop> coffeeShopsSet) {
        System.out.println("Real thing happens later!!");
        this.coffeeShopsProviderSet = new HashSet<CoffeeShop>();
        for(int i=0;i<2;i++){
            coffeeShopsProviderSet.add(coffeeShopsSet.get());
       }
    }

    public void showMenuOpen(){
        for(CoffeeShop c : coffeeShopsProviderSet){
            c.takeOrder();
            c.serveOrder();
        }
    }
}
