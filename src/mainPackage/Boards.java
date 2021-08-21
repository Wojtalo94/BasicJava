package mainPackage;

public class Boards {

	public static void main(String[] args) {

		int[] tab = {5, 10};	//znakami [] oznaczamy w obiekcie tablice
		
		System.out.println("The first value in the table is: " + tab[0]);		//wypisujemy elementy od 0, wiêc wartoœæ 0 w naszej tabeli to 5
		System.out.println("The second value in the table is: " + tab[1]);		//wypisujemy elementy od 0, wiêc wartoœæ 1 w naszej tabeli to 10
	
	
		String[] auta = {"Volvo", "BMW", "Audi", "Ford"};
		System.out.println("The first car is: " + auta[0]);								//wynik Volvo
		
		auta[0] = "Opel";																//zmiana wartoœci w tablicy z Volvo na Opel
		System.out.println("The first car after the auto update is: " + auta[0]);		//wynik Opel
	
		int dl = auta.length;												//dlugosc tablicy auta
		System.out.println("The number of cars in the board is:" + dl);		//iloœæ elementów w tablicy
		
		System.out.println("The last car is: " + auta[dl-1]);				//wyswietlenie ostatniego elementu w tablicy, dlatego ze tablica jest liczona od 0, trzeba wszezdzie uzyc "-1", takze w petlach
	
		
		// Wypisanie zawartoœci tablicy auta przy pomocy pêtli for. 	
		for (int i =0; i <auta.length; i++) 
		{
			System.out.println("Make of car - " + auta[i]);
		}
	}
}
