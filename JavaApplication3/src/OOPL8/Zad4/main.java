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
public class main {
      public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(2);
        
        
        Prostokat prostokat = new Prostokat(2,3);
        
        Trojkat trojkat = new Trojkat(4,2);
        
        Trapez trapez = new Trapez(3,4,5,6,5);
       
        Rownoleglobok rownoleglobok = new Rownoleglobok(55,2,2);
        
        Romb romb = new Romb(2,4);
       
        Kolo kolo = new Kolo(3);
        
        Szescian szescian = new Szescian(4);
        
        Prostopadloscian prostopaloscian = new Prostopadloscian(2,3,4);
        
        Kula kula = new Kula(5);
        
        Walec walec = new Walec(2,1);
       
        Stozek stozek = new Stozek(22,1,5);
       
   System.out.println(prostokat.toString());
   System.out.println(kwadrat.toString());
   System.out.println(trojkat.toString());
   System.out.println(trapez.toString());
   System.out.println(rownoleglobok.toString());
   System.out.println(romb.toString());
   System.out.println(kolo.toString());
   System.out.println(szescian.toString());
   System.out.println(prostopaloscian.toString());
   System.out.println(kula.toString());
   System.out.println(walec.toString());
   System.out.println(stozek.toString());
   
   }
}
