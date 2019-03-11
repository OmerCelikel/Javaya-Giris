
package javaapplication12;

/**
 *
 * @author Ömer Oğuz
 */
public class insan {
    int boy; 
    int kilo ;
    
    public insan(){
        //defoult constravctır
    }
    
    
    public insan (int boy,int kilo){
        if(boy>0&& kilo > 0){
            this.boy = boy;
            this.kilo= kilo;
        }
        
        System.out.println("yeni bir insan oluştu");
        
    }
    void yemek (){
        kilo++;
    }
    
            
}
