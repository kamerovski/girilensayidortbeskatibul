package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class sayikuvvetiyazdir {

	public static void main(String[] args) {
		int a =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz: ");
		a = scan.nextInt();
		
		for(int i=1; i<=a; i*=4) {
			System.out.println("4'un katlari:" + i);
		}
		for (int i=1; i<=a; i*=5) {
			System.out.println("5'in katlari: " + i);
		}
		

	}

}
