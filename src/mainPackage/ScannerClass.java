package mainPackage;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Hello!");		
		Scanner scan = new Scanner(System.in);		// Scanner <- typ obiektu / scan <- zmienna	/ new <- s�owo kluczowe / Scanner <- klasa obiektu / System.in <- konstruktor | import z java util 
		
	//	System.out.println("Podaj liczbe: ");		// wy�wietlenie w konsoli "Podaj liczb�"		
	//	int a = scan.nextInt();						// pobieramy warto�� typu int
	//	System.out.println("Twoja liczba to: " + a);	// wy�wietelnie w konsoli "Twoja liczba to: " oraz podan� liczb�
		
		
		// ----------------------------------------------------------------------------------------		
		
//		System.out.println("Jak masz na imi�: ");			// wy�wietlenie w konsoli "Jak masz na imi�"		
//		String firstName = scan.nextLine();					// pobieramy warto�� typu String 
//		System.out.println("Twoje imi� to: " + firstName);	// wy�wietelnie w konsoli "Twoje imie to: " oraz podane imie
	
		// ----------------------------------------------------------------------------------------			

			
		System.out.println("Enter the first number: ");		// wy�wietlenie w konsoli "Podaj pierwsz� liczb�:"
		int a = scan.nextInt();								// pobieramy warto�� typu intiger 
		System.out.println("Enter the second number: ");			// wy�wietlenie w konsoli "Podaj drug� liczb�:"
		int b = scan.nextInt();								// pobieramy warto�� typu intiger 		
		
		if (a == b)
		{
			System.out.println("The numbers given are equal.");		// wy�wietelnie w konsoli "Podane liczby s� r�wne"
		} else if (a > b) {
			System.out.println(a + " is bigger than " + b);	// wy�wietelnie w konsoli a + " jest wieksze od " + b
		} else
			System.out.println(b + " is bigger than " + a);	// wy�wietelnie w konsoli b + " jest wieksze od " + a
	}
}
