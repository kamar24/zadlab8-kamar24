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
public class Romb extends FiguraPlaska{
   private double x,z;
    

    public Romb(double x, double z) {
        this.x = x;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double obliczObwod() {
        return 4*x;
    }

    
    public double obliczPole() {
        return x*z;
    }
    public String toString() {
    return "Romb : " + ", Bok pierwszy - " + this.x + ", Wys - " + this.z + ", Obwód - " + obliczObwod() + ", Pole - " + obliczPole();}
}