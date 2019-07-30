package structural.pattern.decorator;

/**
 * Decorator pattern allows us  add an addition functionality and Behaviour to an existing Object
 * without changing or affecting its behavior
 */
public class Demo {

    public static void main(String[] args) {

        BasicPhone lBasicPhone = new BasicPhone();
        System.out.println("Calling Basic Phone call function");
        lBasicPhone.call();

        KeyPadPhone lKeypadPhone = new KeyPadPhone(lBasicPhone);
        System.out.println("\nCalling Keypad phone call function");
        lKeypadPhone.call();

        System.out.println("\nCalling Smart phone call function");
        Phone lPhone = new SmartPhone(new KeyPadPhone(new BasicPhone()));
        lPhone.call();

    }
}
