package sample_java_programs;
import java.util.Scanner;
public class Average_q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter 2nd number: ");
		double num2 = scanner.nextDouble();

		System.out.print("Enter 3rd number: ");
		double num3 = scanner.nextDouble();

		double average = (num1 + num2 + num3) / 3;

		System.out.println("Average: " + average);

		scanner.close();
	}
}
