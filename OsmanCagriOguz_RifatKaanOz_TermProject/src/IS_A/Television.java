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
public class Television extends electronicDevice {
    private boolean smartORnot;

    public Television(boolean smartORnot, String brand, boolean usedORnew, int avgDailyConsumption, ArrayList<Website> websiteInfo) {
        super(brand, usedORnew, avgDailyConsumption, websiteInfo);
        this.smartORnot = smartORnot;
    }
    
    @Override
    public String howToSetup() {
        return "Watch tutorial";
    }

    @Override
    public double price() {
        double price = avgPrice;
        if (smartORnot)
            price = super.avgPrice +500.0;
        if (this.usedORnew)
            price=super.avgPrice/2.0;
        return price;
    }

    @Override
    public double consumption() {
        double cons = avgDailyConsumption;
        if (smartORnot)
            cons=super.avgDailyConsumption*1.5;
        return cons;
    }

    @Override
    public String toString(){
        String res = "\nTelevision\n"+super.toString();
        return res + "Is Smart: "+smartORnot+"\nHow to Setup: "+howToSetup()+"\n";
    }

   
}