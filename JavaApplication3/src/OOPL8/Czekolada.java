/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPL8;

/**
 *
 * @author Lukasz
 */
public class Czekolada extends Product {
    public Czekolada(String name, double price, String describe) {
        super(price,name,describe);
    }

    public void buy() {
        System.out.println(
                "I bought a Chocolade!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                        + " name:" + getName()
                        + " describe:" + getDescribe()
        );
    }
}