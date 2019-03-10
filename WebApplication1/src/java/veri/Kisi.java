/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

/**
 *
 * @author Ömer Oğuz
 */
public class Kisi {
    String isim;
    public Kisi(){
        isim = null; // set le isim değişebileceğiz 
                     //get ile alabileceğiz 
                     
        System.out.println("Kişi objesi oluşturuldu");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    } 
}
