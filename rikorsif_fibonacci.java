package otoparkUygulamasi;

import java.util.Scanner;

public class rikorsif_fibonacci {

	public static void main(String[] args) {
				Scanner girdi = new Scanner(System.in);
				System.out.println("Fibonacci dizisinde kaçýncý elemaný görmek istediðinizi yazýnýz : ");
				int sira = girdi.nextInt();
				
				
				
				for(int i = 0; i < sira +1 ; i++) {
					System.out.println(fibonacci2(i));
				}
				System.out.println();
				
				int sonuc = (int) fibonacci2(sira);
				System.out.println(sonuc + ". eleman : " + sonuc);
	}
	public static long fibonacci2 (int n) {
		if(n == 0 ) 
			return 0;
		if( (n == 1) || (n ==2)) 
			return 1;
		
		else {
			return (fibonacci2(n -1) + fibonacci2(n - 2));
		}
	}	
}


