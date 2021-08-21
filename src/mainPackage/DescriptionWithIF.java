package mainPackage;

public class DescriptionWithIF {

	public static void main(String[] args) {	//g³ówna metoda | „static void” oznacza ze metoda nic nie zwraca | „main” to nazwa metody | nasza metoda mo¿e zawieraæ argumenty, czyli rzeczy do niej przekazywane | „String[] args” <- argument przekazywany do naszej metody

		String name;		// String <- typ / name <-nazwa typu / Deklaracja / kompilator przechowywuje zmienn¹ ci¹gu znaków o nazwie 'name'
		name = "Wojtek";	// Inicjalizacja
		System.out.println("Name :'" + name + "'");		// Wypisanie zmiennej = Wojtek
		System.out.println("Word: '" + "name" + "'");	// Wypisanie s³owa = name
		
//---------------------------------------------------------------------------------------------------		
		int age = 25;
		System.out.println("Age: '" + age + "'"); 		// Wypisanie cyfry = 25 przy u¿yciu zmiennej
//--------------------------------------------------------------------------------------------------
		// Instrukcja wyboru ‘If’
		int a = 7;
		int b = 8;
		
		if (a==b)										// pierwszy warunek
		{
			System.out.println("Numbers are equal");	// wypisanie instrukcji, gdy warunek pierwszy jest prawdziwy
		} else {		
		if(a > b){										// drugi warunek
			System.out.println("A is bigger");			// wypisanie instrukcji, gdy warunek drugi jest prawdziwy
		} else {
			System.out.println("A is not bigger");		// wypisanie instrukcji, gdy warunek drugi jest fa³szywy
			}
		}
	}
}
