package creational.pattern.singleton.pattern;

/**
 * ThreadSafe is also Lazy Initialization And it creates object only when it requires
 * But it reduces the performance.Since it's synchronized Thread has to wait even after creating an object
 * So in order to avoid that we can use double checking mechanism
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

public class ThreadSafe {
    private static ThreadSafe mInstance;

    private ThreadSafe() {

    }

    public static synchronized ThreadSafe getInstance() {
        if (mInstance == null) {
            mInstance = new ThreadSafe();
        }
        return mInstance;
    }
}


