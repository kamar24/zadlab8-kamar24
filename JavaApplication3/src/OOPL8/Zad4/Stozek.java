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
public class Stozek extends FiguraPrzestrzenna{
     private double r;
    private double l;
    private double h;

    public Stozek(double r, double l, double h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObjetosc() {
        return 0;
    }

    
    public double obliczPole() {
        return 0;
    }

    @Override
    public String toString() {
       return "Stożek : " + "Promień - " + this.r + ", Wys - " + this.l + " Tworząca - " + this.h + ", Objętość - " + obliczObjetosc() + ", Pole - " + obliczPole();

    }
}