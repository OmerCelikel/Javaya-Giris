package javaapplication4; //java kodlarımızın bir yerde durmasını sağlıyor

/**
 *
 * @author Ömer Oğuz
 */
public class JavaApplication4 {

    
    public static void main(String[] args) {
        
     //insan ali = new insan();   // ali değişkeni yani objemiz
                                //RAM de yaşayan oldu
                                
    calisan ali = new calisan();    //calisan classı ile böyle yaptık                     
    ali.boy=180;
    ali.kilo=77;
    ali.yas=19;
    
    System.out.println("ALİNİN YAŞI : " + ali.yas );
    System.out.println("ALİNİN KİLOSU : " + ali.kilo );  
    System.out.println("ALİNİN BOYU: " + ali.boy );
    
    insan veli = new insan(); // ikinci objemiz ali
    veli.boy=183;
    veli.kilo=73;
    veli.yas=13;
    System.out.println(" ");
    System.out.println("VELİNİN YAŞI : " + veli.yas );
    System.out.println("VELİNİN KİLOUS: " + veli.kilo );  
    System.out.println("VELİNİN BOYU: " + veli.boy );
    
    //BİR KERE CLASS TANIMLADIK MI İSTEDİĞİMİZ KADAR OBJE ÜRETEBİLİYOTUZ
    
    ali.yemek();
    veli.yemek();
    System.out.println("ALİNİN KİLOSU : " + ali.kilo );
    System.out.println("VELİNİN KİLOUS: " + veli.kilo);
    
    ali.maas = 100;
    ali.zam(20);
    System.out.println("ALİNİN MAAŞI 100 İDİ ZAMLI MAAŞI: " + ali.maas);
    }
    
}
