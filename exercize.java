package java_egzersiz;
import java.util.*;
public class exercize {
	

	public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	System.out.println("sayıyı girin");
	
	int sayı=console.nextInt();
	int toplam=0;
	for (int i=1;i<=sayı;i++) {
		if (sayı%2==0) {
			toplam+=i;
			
			
			
		}
		
		System.out.println("toplam:"+toplam);
	}
		
	}
	}


