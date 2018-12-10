/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HP
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        int y ;
        int omer;
        omer = 10;
        System.out.println("Merhaba Dunya" + omer);
        omer = 20;
        System.out.println("Merhaba Dunya" + omer);
        
        double pi = 3.14;
        
        String s = "benim ismim omer oguz";

        System.out.println("10. karakter:"+ s.charAt(10));
        //10. karakteri bastırma
        s= s.toUpperCase();
        
        int ilkBosluk = s.indexOf(" ");
        String ilkKelime = s.substring(0, ilkBosluk);
        //ilk kelimeyi almış olduk last index of boşluk orayı yakaladı ve bastırdık
        
        int sonBosluk = s.lastIndexOf(" ");
        String sonKelime = s.substring(sonBosluk);
                        
        System.out.println(" dizgi " + s + " pi: "+ pi+ " ilk bosluk : "+ ilkBosluk );
        System.out.println("ilk kelime değişkeni:" + ilkKelime);
        System.out.println("son kelime değişkeni:" + sonKelime);
    }
    
}
