package javaapplication12;
/**
 *
 * @author Ömer Oğuz
 */
public class muhendis extends insan{
    int maas;
    
    public muhendis(){
        //this.maas = 7000;
        this(7000); //clas tan aşağıdaki int maaş içindeydi diye
    }
    
    public muhendis (int maas){
        //this.maas = maas;
        if(maas>0){
            this.maas = maas; 
        }
        else {
            this.maas = 7000;
        }
    }
    
    public muhendis (int maas, int boy, int kilo){
        super(boy,kilo);
        //üst clas takiler süper dekiler
        //  insandaki bilgiyi kullanıyor
    }
    
    int zam(){
        maas++;
          return maas;
    }
    
    int zam (float zamOrani){
        float artis = zamOrani * maas ;
        this.zam((int)artis);
        return maas;
    }
    //overloading yaptık 
    int zam (int zamMiktari){
        maas += zamMiktari;
        return maas;
    }
    void yemek (){ //override oluyor yani üstüne biniyor
        kilo = kilo +2 ; // normal insana göre 2 kilo alacak  
    }
    
   
    void yemek (int kilo){
        this.kilo += kilo; // yaşayan objenin kilosuna erişiyor
    }
}
