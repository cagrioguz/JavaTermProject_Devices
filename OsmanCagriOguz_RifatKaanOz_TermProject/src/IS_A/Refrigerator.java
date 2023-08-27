/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IS_A;

import HAS_A.Website;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Refrigerator extends electronicDevice {
    private String energyClass;

    public Refrigerator(String energyClass, String brand, boolean usedORnew, int avgDailyConsumption, ArrayList<Website> websiteInfo) {
        super(brand, usedORnew, avgDailyConsumption, websiteInfo);
        this.energyClass = energyClass;
    }  
    
    @Override
    public String howToSetup() {
        return "Call The Company";
    }

    @Override
    public double price() {
        double price = avgPrice;
        if (energyClass.equalsIgnoreCase("A"))
            price = avgPrice +500;
        if (this.usedORnew)
            price/=2;
        return price;
    }

    @Override
    public double consumption() {
        double cons = avgDailyConsumption;
        if(energyClass.equalsIgnoreCase("A"))
            cons=cons*0.5;
        return cons;
    }
    
    public String toString(){
        String res = "\nRefrigerator\n"+super.toString();
        return res + "Energy Class: "+energyClass+"\nHow to Setup: "+howToSetup();
    }

    
}
