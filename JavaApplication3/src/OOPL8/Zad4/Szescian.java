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
public class Szescian  extends FiguraPrzestrzenna{
     private double a;

    public Szescian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(a, 3);
    }

    
    public double obliczPole() {
        return 6 * Math.pow(a, 2);
    }
    public String toString() {
return "Sześcian :" + "Bok - " + this.a + "Objętość - " + obliczObjetosc() + ", Pole - " + obliczPole();
}
}
