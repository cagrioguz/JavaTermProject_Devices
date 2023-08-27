package IS_A;


import HAS_A.Website;
import Interface.Setup;
import java.util.ArrayList;
import java.util.Scanner;
import IS_A.Television;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public abstract class electronicDevice implements Setup {
    protected String brand;
    protected boolean usedORnew;
    protected double avgPrice;
    protected int avgDailyConsumption;
    protected ArrayList<Website> websiteInfo;

    public electronicDevice(String brand, boolean usedORnew, int avgDailyConsumption, ArrayList<Website> websiteInfo) {
        this.brand = brand;
        this.usedORnew = usedORnew;
        this.avgDailyConsumption = avgDailyConsumption;
        this.websiteInfo = websiteInfo;
        double avg=0;
        for(int i=0;i<websiteInfo.size();i++){
            avg+=websiteInfo.get(i).getPrice();
        }   
        this.avgPrice = avg/websiteInfo.size();
    }

    public String getBrand() {
        return brand;
    }
          
    public boolean checkDevice(String brand) {
        return this.brand.equalsIgnoreCase(brand);
    }
    
    public abstract double price();       
    public abstract double consumption();  

    public String toString(){
        String w = "";
        for (Website part : this.websiteInfo) {
            w += part.toString();
        }
        return "Device Brand & Model: "+brand+"\nIs Used: "+usedORnew+"\nAverage Price: "+avgPrice+"\nAverage Daily Consumption: "+avgDailyConsumption+"\nWebsites: "+w+"\n"; 
    }
}

