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
public class Kolo extends FiguraPlaska {
     private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

   
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Koło: " + "Promień - " + this.r + ", Obwód - " + obliczObwod() + ", Pole - " + obliczPole();
    }
}