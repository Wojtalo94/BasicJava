package mainPackage;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Hello!");		
		Scanner scan = new Scanner(System.in);		// Scanner <- typ obiektu / scan <- zmienna	/ new <- s³owo kluczowe / Scanner <- klasa obiektu / System.in <- konstruktor | import z java util 
		
	//	System.out.println("Podaj liczbe: ");		// wyœwietlenie w konsoli "Podaj liczbê"		
	//	int a = scan.nextInt();						// pobieramy wartoœæ typu int
	//	System.out.println("Twoja liczba to: " + a);	// wyœwietelnie w konsoli "Twoja liczba to: " oraz podan¹ liczbê
		
		
		// ----------------------------------------------------------------------------------------		
		
//		System.out.println("Jak masz na imiê: ");			// wyœwietlenie w konsoli "Jak masz na imiê"		
//		String firstName = scan.nextLine();					// pobieramy wartoœæ typu String 
//		System.out.println("Twoje imiê to: " + firstName);	// wyœwietelnie w konsoli "Twoje imie to: " oraz podane imie
	
		// ----------------------------------------------------------------------------------------			

			
		System.out.println("Enter the first number: ");		// wyœwietlenie w konsoli "Podaj pierwsz¹ liczbê:"
		int a = scan.nextInt();								// pobieramy wartoœæ typu intiger 
		System.out.println("Enter the second number: ");			// wyœwietlenie w konsoli "Podaj drug¹ liczbê:"
		int b = scan.nextInt();								// pobieramy wartoœæ typu intiger 		
		
		if (a == b)
		{
			System.out.println("The numbers given are equal.");		// wyœwietelnie w konsoli "Podane liczby s¹ równe"
		} else if (a > b) {
			System.out.println(a + " is bigger than " + b);	// wyœwietelnie w konsoli a + " jest wieksze od " + b
		} else
			System.out.println(b + " is bigger than " + a);	// wyœwietelnie w konsoli b + " jest wieksze od " + a
	}
}
