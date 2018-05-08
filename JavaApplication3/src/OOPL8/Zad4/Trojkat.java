/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPL8.Zad4;

/**
 *
 * @author Lukasz
 */
public class Trojkat  extends FiguraPlaska{
     private double a,h;

    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return 3*a;
    }

    
    public double obliczPole() {
        return (a*h)/2;
    }
    public String toString() {
        return "Trójkąt : " + "Bok pierwszy - " + this.a + " Wys - " + this.h + ", Obwód - " + obliczObwod() + ", Pole - " + obliczPole();
    }
}