package creational.pattern.singleton.pattern;

/**
 * ThreadSafeWithDoubleChecking is similar But Here thread queued  only for object creation
 * Once the object is created Thread will not queued for getting an object
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
public class ThreadSafeWithDoubleChecking {
    private static ThreadSafeWithDoubleChecking mInstance;

    private ThreadSafeWithDoubleChecking() {

    }

    public static ThreadSafeWithDoubleChecking getInstance() {
        if (mInstance == null) {
            synchronized (ThreadSafeWithDoubleChecking.class) {
                if (mInstance == null) {
                    mInstance = new ThreadSafeWithDoubleChecking();
                }
            }
        }
        return mInstance;
    }
}
