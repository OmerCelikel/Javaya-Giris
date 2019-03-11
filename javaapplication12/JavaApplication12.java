
package javaapplication12;

/**
 *
 * @author Ömer Oğuz
 */
public class JavaApplication12 {

    
    public static void main(String[] args) {
            insan ali = new insan();
            //muhendis veli = new muhendis(); this maaş (int maas)
             //muhendis veli = new muhendis(20000);
            muhendis veli = new muhendis(20000, 180,80); // super yaptığımızda böyle oldu
            
            veli.boy = 180;
            System.out.println("velinin boyu"+ veli.boy);
            
            veli.kilo = 90;
            veli.yemek();
            System.out.println("velinin kilo"+ veli.kilo);
            
            //veli.maas = 10000; mühendisin maalını belirlediğimiz 
            // için kullanmayabiliriz
            veli.zam((float)0.50); // int float olan yere gitti
            System.out.println("velinin maaş"+ veli.maas);
            
            ali.kilo = 80;
            ali.yemek();
            System.out.println("ali kilo "+ ali.kilo);
    }
    
}
