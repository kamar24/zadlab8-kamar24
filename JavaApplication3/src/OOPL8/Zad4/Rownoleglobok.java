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
public class Rownoleglobok extends FiguraPlaska{
      private double a;
    private double b;
    private double c;

    public Rownoleglobok(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return c;
    }

    public void setH(double c) {
        this.c = c;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }

   
    public double obliczPole() {
        return 0;
    }

    @Override
    public String toString() {
        return "Równoległobok : " + ", Bok pierwszy - " + this.a + ", Bok drugi - " + this.b + ", Wys - " + this.c + ", Obwód - " + obliczObwod() + ", Pole - " + obliczPole();
    }
}