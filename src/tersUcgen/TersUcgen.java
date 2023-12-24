package tersUcgen;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Basamak sayisini girin: ");
		int basamakSayisi = scanner.nextInt();
		
		for (int i = basamakSayisi; i >= 1; i--) {
			for (int j = 1; j <= basamakSayisi - i; j++) {
				System.out.print(" "); // bosluklari ekrana yazdir
				
			}
			
			for (int k = 0; k <= 2 * i - 1; k++) {
				System.out.print("*"); // yildizlari ekrana yazdir
				
			}
			
			System.out.println(); // bir alt satira gec
		}
		
		scanner.close();

	}

}
