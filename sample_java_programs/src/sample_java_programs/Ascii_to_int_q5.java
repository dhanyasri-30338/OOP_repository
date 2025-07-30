package sample_java_programs;
import java.util.*;
public class Ascii_to_int_q5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		int asciiValue = (int) ch;

		System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
		System.out.println("Integer: " + asciiValue);

		scanner.close();
	}
}

