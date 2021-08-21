package mainPackage;

public class TryAndCatch {

	public static void main(String[] args) {

		int liczba =5;
		String s³owo = Integer.toString(liczba);	// zmiana liczby na Stringa
		
		try										// 'try & catch' nie wypisze nam b³êdów w konsoli i nie przerwie programu 
		{
			s³owo = "1234a";					
			liczba = Integer.parseInt(s³owo);	// tutaj zamieniamy s³owa na liczbê, ale ¿e mam 'a' to znaczy ¿e tu bêdzie b³¹d
		}
		catch (Exception e)						// 'e' to jest nazwa Exception-a
		{
			liczba = 0;							// tutaj wpisujemy co ma siê równaæ zmiennej, jeœli powy¿ej w 'try' mamy b³¹d
		}	
		System.out.println(liczba);				// poniewa¿ mamy b³¹d, to program wyœwietli '0', zamiast b³êdu z '1234a'
		

		try
		{
			System.out.println("1");			// nie ma tu b³êdu dlatego wypisze '1'
			s³owo = "1234a";					// nie ma tu b³êdu dlatego ¿e w String-u mo¿emy napisaæ wszystko
			System.out.println("2");			// nie ma tu b³êdu dlatego wypisze '2'
			liczba = Integer.parseInt(s³owo);	// tutaj zamieniamy s³owa na liczbê, ale ¿e mam 'a' to znaczy ¿e tu bêdzie b³¹d
			System.out.println("3");			// powy¿ej wyst¹pi³ b³¹d i ta linia siê nie wykona, tylko program przeskoczy do catch
		}
		
		catch (Exception e)						// jeœli powy¿ej nie bêdzie b³êdu, blok 'catch' zostanie pomioniêty
		{
			liczba = 0;
			System.out.println("WARNING: Error !!!");			// nast¹pi wypisanie 'B³¹d' poniewa¿ specjalnie wywo³aliœmy b³¹d
			System.out.println(e.toString());					// wypisuj¹c zmienn¹ 'e' oraz 'toString' u¿yt¹ na pocz¹tku aby wpypisaæ b³¹d
		}
		System.out.println(liczba);
	}
}
