package creational.pattern.singleton.pattern;

/**
 * Eager Initialization is creating object at the place of variable declaration itself
 * so object creation will happen  when the class is loading
 * <p>
 * <p>
 * -------------------------------Points to noted when it comes to Singleton--------------------------------
 * ---> set the Constructor access modifier as private so the Object can't created from outside of the class
 * ---> Since we can't create the from outside need to create the object within the class
 * ---> Then crate a static method to return the instance
 * ---------------------------------------------------------------------------------------------------------
 */
public class EagerInitialization {
    private static final EagerInitialization mInstnace = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return mInstnace;
    }
}
