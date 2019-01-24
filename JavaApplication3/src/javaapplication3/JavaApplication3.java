package javaapplication3;

import java.io.*; // dersek aşağıdakilere gerek yok
/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;*/

/**
 *
 * @author Ömer Oğuz
 */
public class JavaApplication3 {
    public static void main(String[] args) {
        
        File f = new File("a.txt");    //a dsoyasına ihtiyaç var
        
        try{
            FileReader fr = new FileReader(f);
            int c = fr.read();
            
           while (c!=-1){
            
                //char k = (char)c;       //char basmak itersek bu
                //System.out.print(k+" ");  //char basmak itersek bu
                System.out.print(c+" "); //sayı basarsak bu
                 c = fr.read();
               }
            fr.close();
            
            f = new File("a.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(br.readLine());
            
            br.close();     //burada da şekil yaptık yanına çıkması için
            
            File cikti = new File("cikti.txt"); //yeni bir dosya oldu
            FileWriter fw = new FileWriter(cikti);
            fw.write("omerden mesaj");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
