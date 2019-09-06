
public class FindTheMissingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char test = 'a';
		int x = (int) test;
		System.out.println(x);

		char testArray[] = { 'a', 'c', 'd' ,'e', 'f' };
		System.out.println(findMissingLetter(testArray));
		System.out.println(findMissingLetter2(testArray));
		
		char letter = 'a';
		letter = (char) (letter + 1);
		System.out.println(letter);

	}
	
	public static char findMissingLetter(char[] array) {
		int tempAscii = 0;
		for (int i = 0; i < array.length; i++) {
			tempAscii = (int) array[i];
			if (((int) array[i + 1]) != (tempAscii + 1)) {
				char ans = (char) (tempAscii + 1);
				return ans;
			}
		}
		return ' ';
	}

	public static char findMissingLetter2(char[] array) {
		char expectableLetter = array[0];
		for (char letter : array) {
			if (letter != expectableLetter)
				break;
			expectableLetter++;
		}
		return expectableLetter;
	}

}
