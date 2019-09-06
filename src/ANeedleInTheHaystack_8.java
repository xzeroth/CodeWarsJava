
public class ANeedleInTheHaystack_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] haystack2 = { "283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle",
				"something somebody lost a while ago" };
		Object[] haystack1 = { "3", "123124234", null, "needle", "world", "hay", 2, "3", true, false };
		System.out.println(findNeedle(haystack2));
		System.out.println(findNeedle(haystack1));
	}

	public static String findNeedle(Object[] haystack) {
//		for(int i = 0 ; i < haystack.length ; i ++) {
//			if(haystack[i].equals("needle")) {
//				return String.format("found the needle at position %s", i);
//			}
//		}
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == "needle") {
				return String.format("found the needle at position %s", i);
			}
		}
		return null;
	}

}
