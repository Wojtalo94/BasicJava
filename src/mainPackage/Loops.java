package mainPackage;

public class Loops {

	public static void main(String[] args) {

		//	P�tla while b�dzie wykonywa� si� tak d�ugo, jak warunek b�dzie spe�niony.
		//	while (warunek) {
			// kod do wykonania
		//	}
					
			int i = 0;
			while (i < 5) {
				System.out.println(i);
				i++;
			}
			
//---------------------------------------------------------------------------------------------------
			
		//Trzeba pami�ta� o zwi�kszaniu licznika (w tym przypadku �i�, inaczej p�tl� b�dzie niesko�czona)
		//	P�tla do/while jest wariantem p�tli while. P�tla zawsze wykona si� przynajmniej jeden raz, poniewa� warunek jest sprawdzany na samym ko�cu.			
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
			//P�tla for � stosujemy j� je�eli wiemy ile razy ma si� wykona� dany kod.
			//for (wyra�enie 1; wyra�enie 2; wyra�enie 3) {
			// kod do wykonania
			//	}
			//wyra�enie 1 � wykona si� jeden raz na samym pocz�tku
			//wyra�enie 2 � jest to warunek p�tli
			//wyra�enie 3 � wykona si� za ka�dym razem po wykonaniu ca�ego kodu p�tli
			
			
			for (int x = 0; x < 5; x++) {
			System.out.println(x);	
			}
	}
}
