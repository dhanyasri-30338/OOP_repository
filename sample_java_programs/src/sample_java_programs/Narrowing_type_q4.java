package sample_java_programs;
import java.util.*;
public class Narrowing_type_q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        double doubleValue = scanner.nextDouble();

        int intValue = (int) doubleValue;

        System.out.println("\nBefore: " + doubleValue);
        System.out.println("After: " + intValue);

        scanner.close();

	}

}
