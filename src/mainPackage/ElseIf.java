package mainPackage;

public class ElseIf {

	public static void main(String[] args) {
		
		//Sentencja else if sprawdza drugi warunek je¿eli pierwszy by³ false
		
		
		int time = 22;
		if (time < 10) {							// warunek 1		
		System.out.println("It is morning.");		// blok kodu je¿eli warunek1 jest spe³niony
		} else if (time < 20) {						// warunek 2 
		System.out.println("It is daytime.");		// blok kodu je¿eli warunek1 nie jest spe³niony, ale warunek2 jest spe³niony
		} else {
		System.out.println("It is evening.");		// blok kodu je¿eli obydwa warunki nie s¹ spe³nione
		}
		// wynik "It is evening"
	}

}
