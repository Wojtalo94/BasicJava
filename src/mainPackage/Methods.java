package mainPackage;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Hello !!!");
	
		myMethod("Anna", 25);		// "myMethod" <- nazwa metody  |   teraz wywo�ujemy metod�   |  trzeba to zrobi� przed deklaracj� metody
		myMethod("Wojtek", 50);		// wypisanie warto�ci argument�w | String fname, int age | String Wojtek, int 50
		
	}
	public static void myMethod(String fname, int age) {	// "String fname, int age"  <- 2 argumenty | "static void" metoda nic nie zwraca = ma X lat nie zostanie wy�wietlone w konsoli
		System.out.println(fname + " is " + age + " years old.");
	}
}