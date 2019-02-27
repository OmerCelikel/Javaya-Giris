/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Ömer Oğuz
 */
public class insan {
//BİR KERE CLASS TANIMLADIK MI İSTEDİĞİMİZ KADAR OBJE ÜRETEBİLİYOTUZ
    int kilo;
    int boy;
    int yas;
    int maas;
    void yemek (){ // metot yaptık 
        kilo = kilo + 3 ;
    }
    
    void zam(int oran){
        maas = maas + maas * oran/100;
    }
}
