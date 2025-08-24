package java_egzersiz;
import java.util.*;

public class java2 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("asal olup olmadığını merak ettiğiniz sayıyı girin");
		int sayı=console.nextInt();
		int flag=0;
		
		for(int i=2;i<=sayı/2;i++) {
			if(sayı%i==0) {
				flag=1;
			}
			
		}
		if (flag==0) {
			System.out.println("sayınız asaldır");
		}
		else {
			System.out.println("sayınız asal değildir");
		}
}
}
