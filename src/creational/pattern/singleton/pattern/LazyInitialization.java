package creational.pattern.singleton.pattern;

/**
 * Lazy Initialization is creating object only when it requires.And it's not thread safe
 * <p>
 * Object creation will happen only when you call the object creation method
 *
 * <p>
 * <p>
 * -------------------------------Points to noted when it comes to Singleton--------------------------------
 * ---> set the Constructor access modifier as private so the Object can't created from outside of the class
 * ---> Since we can't create the from outside need to create the object within the class
 * ---> Then crate a static method to return the instance
 * ---------------------------------------------------------------------------------------------------------
 */
public class LazyInitialization {

    private static LazyInitialization mInstance;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (mInstance == null) {
            mInstance = new LazyInitialization();
        }
        return mInstance;
    }
}
