
public class TypeCharacter {
	public static void main(String[] args) {
		char myChar = 'a';
		System.out.println(myChar);
		
		myChar = 65; // ASCII value
		System.out.println(myChar);
		
		myChar = ''; // cannot be empty
		myChar = "a"; // valid but discouraged, use single quotes instead
		
		myChar = 65 + 1;
		// char myOtherChar = myChar + 1; // Won't work because it casts to integer by default
		char myOtherChar = (char) (myChar + 1); // Cast to force char type
		
		System.out.println(myOtherChar);
		
		String word = "Alura";
		System.out.println(word + ' ' + word);
		
		word = 'alura'; // valid but discouraged, use double quotes instead
	}
}
