package mainPackage;

public class SwitchLoop {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		int result;
		
		int operation = 0;
		switch (operation) {	//'switch' <- s³owo kluczowe | '(operation)' warunek do sprawdzenia
		case '+':
			result = a + b;		// operacja do wykonania
			break;				// koñczymy przez 'break'
		case '-':				// bez s³owa 'break' switch przejdzie do sprawdzenia pozosta³ych warunków
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		default:		// domyœlna operacja wykona siê zawsze jak dojdzie w to miejsce (brak 'break')
			System.out.println("Operation not implemented yet");
		}
	}
}
