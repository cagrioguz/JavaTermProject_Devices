package HAS_A;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Website {
    private String websiteName;
    private double price;
    
    public Website(String websiteName, double price) {
        this.websiteName = websiteName;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    public String toString(){
        return "\nWebsite Name: "+websiteName+"\nPrice in the website: "+price;
    }
}
