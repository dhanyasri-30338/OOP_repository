package sample_java_programs;

public class Data_types_q1 {

	public static void main(String[] args) {
		byte b = 100;
        System.out.println("byte value: " + b);
        System.out.println("Size of byte: " + Byte.SIZE + " bits");

        short s = 10000;
        System.out.println("\nshort value: " + s);
        System.out.println("Size of short: " + Short.SIZE + " bits");

        int i = 123456789;
        System.out.println("\nint value: " + i);
        System.out.println("Size of int: " + Integer.SIZE + " bits");

        long l = 9876543210L;
        System.out.println("\nlong value: " + l);
        System.out.println("Size of long: " + Long.SIZE + " bits");

        float f = 3.14f;
        System.out.println("\nfloat value: " + f);
        System.out.println("Size of float: " + Float.SIZE + " bits");

        double d = 3.141592653589793;
        System.out.println("\ndouble value: " + d);
        System.out.println("Size of double: " + Double.SIZE + " bits");

        char c = 'A';
        System.out.println("\nchar value: " + c);
        System.out.println("Size of char: " + Character.SIZE + " bits");

        boolean bool = true;
        System.out.println("\nboolean value: " + bool);
        System.out.println("Size of boolean: JVM dependent (not defined by Java)");


	}

}
