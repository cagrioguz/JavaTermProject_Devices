/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAndSys;

import HAS_A.Website;
import IS_A.Laptop;
import IS_A.Refrigerator;
import IS_A.Television;
import IS_A.electronicDevice;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class deviceSys {
    public static ArrayList<electronicDevice> arr = new ArrayList();

    public static boolean isDeviceExists(String deviceName_brand) {
        for (int i = 0; i < arr.size(); i++) {
            electronicDevice e = arr.get(i);
            if (e.checkDevice(deviceName_brand)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean addTv(boolean smartORnot, ArrayList<Website> w, String brand, boolean usedORnew, int avgDailyConsumption){
        if(isDeviceExists(brand)){
            return false;
        }
        else
        {
            Television t = new Television(smartORnot,brand,usedORnew,avgDailyConsumption,w);
            arr.add(t);
            return true;
        }
    }
    public static boolean addRefrigerator(String energyClass,ArrayList<Website> w, String brand, boolean usedORnew, int avgDailyConsumption){
           if(isDeviceExists(brand)){
            return false;
        }
        else
        {
            Refrigerator r = new Refrigerator(energyClass,brand,usedORnew,avgDailyConsumption,w);
            arr.add(r);
            return true;
        }
    }
    public static boolean addLaptop(double ram, double memory, boolean gamePc,ArrayList<Website> w, String brand, boolean usedORnew, int avgDailyConsumption){
        if(isDeviceExists(brand)){
            return false;
        }
        else
        {
            Laptop l = new Laptop(ram,memory,gamePc,brand,usedORnew,avgDailyConsumption,w);
            arr.add(l);
            return true;
        }
    }

    public static ArrayList<electronicDevice> getArr() {
        return arr;
    }
    
    
    public static double calculateTotalExpenses(){
        electronicDevice temp;
        ArrayList<Double> price;
        price = new ArrayList<>();
        ArrayList<Double> cons;
        cons = new ArrayList<>();
        double total = 0;
        for (int i = 0; i < arr.size(); i++){
            temp = (electronicDevice)arr.get(i);
            price.add(temp.price());
            cons.add(temp.consumption());
            total+=price.get(i)+cons.get(i)*1.37*30;
        }
        return total;
    }
    
    
    public static String display() {
        electronicDevice temp;
        String out = "";
        for (int i = 0; i < arr.size(); i++) {
            temp = (electronicDevice) arr.get(i);
            out += temp.toString() + "\n";
            out+="Actual price: "+temp.price();
            out+="\nActual consumption: "+temp.consumption()+"\n";
        }
        return out;
    }
    
    public static electronicDevice searchDevice(String brand) {
        for (int i = 0; i < arr.size(); i++) {
            String brandObj = arr.get(i).getBrand();
            if (brandObj.equalsIgnoreCase(brand)) {
                return arr.get(i);
            }
        }
        return null;
    }
    
    public static boolean removeDevice(String brand) {
        for (int i = 0; i < arr.size(); i++) {
            String brandObj = arr.get(i).getBrand();
            if (brandObj.equalsIgnoreCase(brand)) {
                arr.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
