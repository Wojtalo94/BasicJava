package mainPackage;

public class TryAndCatch {

	public static void main(String[] args) {

		int liczba =5;
		String s�owo = Integer.toString(liczba);	// zmiana liczby na Stringa
		
		try										// 'try & catch' nie wypisze nam b��d�w w konsoli i nie przerwie programu 
		{
			s�owo = "1234a";					
			liczba = Integer.parseInt(s�owo);	// tutaj zamieniamy s�owa na liczb�, ale �e mam 'a' to znaczy �e tu b�dzie b��d
		}
		catch (Exception e)						// 'e' to jest nazwa Exception-a
		{
			liczba = 0;							// tutaj wpisujemy co ma si� r�wna� zmiennej, je�li powy�ej w 'try' mamy b��d
		}	
		System.out.println(liczba);				// poniewa� mamy b��d, to program wy�wietli '0', zamiast b��du z '1234a'
		

		try
		{
			System.out.println("1");			// nie ma tu b��du dlatego wypisze '1'
			s�owo = "1234a";					// nie ma tu b��du dlatego �e w String-u mo�emy napisa� wszystko
			System.out.println("2");			// nie ma tu b��du dlatego wypisze '2'
			liczba = Integer.parseInt(s�owo);	// tutaj zamieniamy s�owa na liczb�, ale �e mam 'a' to znaczy �e tu b�dzie b��d
			System.out.println("3");			// powy�ej wyst�pi� b��d i ta linia si� nie wykona, tylko program przeskoczy do catch
		}
		
		catch (Exception e)						// je�li powy�ej nie b�dzie b��du, blok 'catch' zostanie pomioni�ty
		{
			liczba = 0;
			System.out.println("WARNING: Error !!!");			// nast�pi wypisanie 'B��d' poniewa� specjalnie wywo�ali�my b��d
			System.out.println(e.toString());					// wypisuj�c zmienn� 'e' oraz 'toString' u�yt� na pocz�tku aby wpypisa� b��d
		}
		System.out.println(liczba);
	}
}
