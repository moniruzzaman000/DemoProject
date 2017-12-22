package methods;

public class JavaMethodPractice {

	public static void main(String[] args) {

		System.out.println(getCountOfAllChar("Moniruzzaman"));

	}

	/**
	 * Exercise: 30 Write a method that take one String input and return the
	 * count of all characters without whitespace. Parameter: String text
	 * ReturnType: int ServingContainer: Variable
	 */

	public static int getCountOfAllChar(String text) {
		int count = 0;
		text = text.replace(" ", "");

		count = text.length();

		return count;
	}

}
