package javaapplication6;

/**
 *
 * @author Ömer Oğuz
 */

    class insan{
        int boy;
    }
    
class ogrenci extends insan implements Cloneable{
    
    // DİP KOPLA-YALAMA YAPACAĞIZ
    Object kopyala() throws CloneNotSupportedException {
        return this.clone();
    }
    
}// HER öğrenci İnsandır burada öğrencinin boyundan bahsedebiliriz



// HER pakette bir public class olur
public class JavaApplication6 {

    public static void main(String[] args)throws CloneNotSupportedException {
        
        insan ali = new insan();
        //insan veli= new insan();
        insan ahmet = ali; // sığ kopyalama yaptık 
        ali.boy = 180;
        System.out.println(ahmet.boy);
        if(ali==ahmet){
            System.out.println("EŞİTLER");
        }
            
        ogrenci ayse = new ogrenci();
        ayse.boy = 160;
        ogrenci fatma = (ogrenci)ayse.kopyala(); // Deep copy
        System.out.println("aysenin boy= " + ayse.boy);
        System.out.println("fatmanın boy= " +fatma.boy);
        fatma.boy= 190;
        System.out.println("aysenin boy= " + ayse.boy);
        System.out.println("fatmanın boy= "+fatma.boy);
    }
    
}
