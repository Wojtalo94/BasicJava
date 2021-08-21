package mainPackage;

public class SwitchLoop {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		int result;
		
		int operation = 0;
		switch (operation) {	//'switch' <- s�owo kluczowe | '(operation)' warunek do sprawdzenia
		case '+':
			result = a + b;		// operacja do wykonania
			break;				// ko�czymy przez 'break'
		case '-':				// bez s�owa 'break' switch przejdzie do sprawdzenia pozosta�ych warunk�w
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		default:		// domy�lna operacja wykona si� zawsze jak dojdzie w to miejsce (brak 'break')
			System.out.println("Operation not implemented yet");
		}
	}
}
