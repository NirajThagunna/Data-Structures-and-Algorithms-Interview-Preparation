package wrapperClasses;

// Character class methods 
public class CharacterClass {

	public static void main(String[] args) {
		
		Character a = 'A';
		Character b = '0';
		
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isDigit(b));
		System.out.println(Character.isLetter(b));
		
		Character c = ' ';
		System.out.println(Character.isWhitespace(c));
	}
}
