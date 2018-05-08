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
public class Kula extends FiguraPrzestrzenna{
     private double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczObjetosc() {
        return (4*Math.PI*Math.pow(r,3))/3;
    }

   
    public double obliczPole() {
        return 4*Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
         return "Kula : " + "Promień - " + this.r + ", Objętość - " + obliczObjetosc() + ", Pole - " + obliczPole();
    }
}
