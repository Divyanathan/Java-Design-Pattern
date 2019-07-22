package creational.pattern.singleton.pattern;

/**
 * Since enums are inherently serializable, we don't need to implement it with a serializable interface.
 * The reflection problem is also not there. Therefore, it is 100% guaranteed that only one instance of the singleton is present within a JVM.
 * Thus, this method is recommended as the best method of making singletons in Java.
 * <p>
 * But here in Enum lazy initialization is not possible
 * <p>
 * In enum you can create method as per your requirement and call those method using Instance
 */
public enum EnumSingleton {
    INSTANCE;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}

/**
 * This class has main method using which we can execute the code
 */
class DemoEnum {

    public static void main(String[] args) {
        EnumSingleton lEnumSingleton = EnumSingleton.INSTANCE;
        System.out.println(lEnumSingleton.addition(10, 20));
        System.out.println(lEnumSingleton.subtraction(10, 20));
        System.out.println(lEnumSingleton.multiplication(10, 20));
        System.out.println(lEnumSingleton.division(10, 20));
        System.out.println(lEnumSingleton.modulo(10, 20));
    }
}
