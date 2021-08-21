package mainPackage;

public class ChangeOfVaruables {

	public static void main(String[] args) {

		// 1. int to String
		int number = 5;
		String word = Integer.toString(number);
		System.out.println("1. " + word);
		
		// 2. String to int
		word = "1234";
		number = Integer.parseInt(word);
		System.out.println("2. " + number);

		// 3. char to int
		char c = '5';
		int a = Character.getNumericValue(c);
		System.out.println("3. " + a);	
		
		// 4. board char to String
		char[] name = {'a', 'b', 'c', 'd'};
		String nameString = String.valueOf(name);
		System.out.print("4. ");
		System.out.println(name);
		
		// 5. druga metoda
		nameString = new String(name);
		System.out.print("5. ");
		System.out.println(name);
	}
}
