package mainPackage;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Hello !!!");
	
		myMethod("Anna", 25);		// "myMethod" <- nazwa metody  |   teraz wywo³ujemy metodê   |  trzeba to zrobiæ przed deklaracj¹ metody
		myMethod("Wojtek", 50);		// wypisanie wartoœci argumentów | String fname, int age | String Wojtek, int 50
		
	}
	public static void myMethod(String fname, int age) {	// "String fname, int age"  <- 2 argumenty | "static void" metoda nic nie zwraca = ma X lat nie zostanie wyœwietlone w konsoli
		System.out.println(fname + " is " + age + " years old.");
	}
}