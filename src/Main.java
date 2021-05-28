import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// str is an OBJECT REFERENCE
		// It currently refers to NULL
		String str;

		// This line associates str with
		// and object
		str = "Avocado";

		// If we want no longer want to refer
		// to an object, we can set the reference
		// to null
		str = null;

		// Having a null reference isn’t a
		// problem in Java BUT can cause a RUNTIME ERROR if
		// you access an object that does not exist…
		System.out.println(str.length());

		// If we are concerned that an object might be null,
		// we can use an if-statement to check its status.
		if (str == null) {
			System.out.print("Enter a word");
			Scanner input = new Scanner(System.in);
			str = input.next();
		}

	}

}
