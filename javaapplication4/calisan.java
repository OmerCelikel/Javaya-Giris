
package javaapplication4;

/**
 *
 * @author Ömer Oğuz
 */
public class calisan extends insan { 
// her çalışan insandaki tüm özellikleri alacaak (extends)
// extends diğer alt gruoplara dağıtıyor    
    int maas;
    
    void zam(int oran){
        maas = maas + maas * oran/100;
    }
    
}
