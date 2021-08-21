package mainPackage;

public class Loops {

	public static void main(String[] args) {

		//	Pêtla while bêdzie wykonywaæ siê tak d³ugo, jak warunek bêdzie spe³niony.
		//	while (warunek) {
			// kod do wykonania
		//	}
					
			int i = 0;
			while (i < 5) {
				System.out.println(i);
				i++;
			}
			
//---------------------------------------------------------------------------------------------------
			
		//Trzeba pamiêtaæ o zwiêkszaniu licznika (w tym przypadku ‘i’, inaczej pêtl¹ bêdzie nieskoñczona)
		//	Pêtla do/while jest wariantem pêtli while. Pêtla zawsze wykona siê przynajmniej jeden raz, poniewa¿ warunek jest sprawdzany na samym koñcu.			
		//	do {
			// kod do wykonania
		//	}
			//while (warunek);

			int z = 0;
			do {
				System.out.println(z);
				z++;
			}
			while (z < 5);
		
//---------------------------------------------------------------------------------------------------			
			//Pêtla for – stosujemy j¹ je¿eli wiemy ile razy ma siê wykonaæ dany kod.
			//for (wyra¿enie 1; wyra¿enie 2; wyra¿enie 3) {
			// kod do wykonania
			//	}
			//wyra¿enie 1 – wykona siê jeden raz na samym pocz¹tku
			//wyra¿enie 2 – jest to warunek pêtli
			//wyra¿enie 3 – wykona siê za ka¿dym razem po wykonaniu ca³ego kodu pêtli
			
			
			for (int x = 0; x < 5; x++) {
			System.out.println(x);	
			}
	}
}
