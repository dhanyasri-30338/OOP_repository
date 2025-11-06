package module2_scenario_based;

public class ReflectionDemo1 {

    // Inner Product class
    static class Product {
        public void showDetails() {
            System.out.println("Product: Reflection-enabled gadget");
        }
    }

    public static void main(String[] args) throws Exception {
        // Correct class path with package name
        Class<?> clazz = Class.forName("module2_scenario_based.ReflectionDemo1$Product");

        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getMethod("showDetails").invoke(obj);
    }
}
