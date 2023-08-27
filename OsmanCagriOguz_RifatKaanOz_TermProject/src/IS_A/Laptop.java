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
public class Laptop extends electronicDevice {
    private double ram;
    private double memory;
    private boolean gamePc;

    public Laptop(double ram, double memory, boolean gamePc, String brand, boolean usedORnew, int avgDailyConsumption, ArrayList<Website> websiteInfo) {
        super(brand, usedORnew, avgDailyConsumption, websiteInfo);
        this.ram = ram;
        this.memory = memory;
        this.gamePc = gamePc;
    }
    
    @Override
    public String howToSetup() {
        return "Download Windows to USB and watch a tutorial";
    }

    @Override
    public double price() {
       double price = avgPrice;
       if (ram > 16)
           price = avgPrice +1000;
       if(memory > 512)
           price=avgPrice+500;
       if (this.usedORnew)
           price/=2;
       return price;
    }

    @Override
    public double consumption() {
        double cons = avgDailyConsumption;
        if(gamePc)
            cons=cons*2;
        return cons;
    }
    
    public String toString(){
        String res = "\nLaptop\n"+super.toString();
        return res +"\nRam: "+ram+"\nMemory: "+memory+"\nIs Game Pc: "+gamePc+"\nHow to Setup: "+howToSetup();
    }

    

}
