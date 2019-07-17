package creational.pattern.singleton.pattern;

/**
 * Since the method and variable are static it creates the memory Whenever the project is loaded
 * Whether we use it or not it occupies some memory what if we create 10000s of classes with static
 * We have to use static and we don't want waste the memory .Want allocate the memory only when it requires
 * That can achievable creating static inner class
 *
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
public class BillPugh {
    private BillPugh() {

    }

    /**
     * This class is not Thread Safe
     */
    private static class ObjectCreator {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    /**
     * This class is Thread Safe
     */
    private static class ThreadSafeObjectCreator {
        private static BillPugh mInstance;

        private static BillPugh getmInstance() {
            if (mInstance == null) {
                synchronized (ThreadSafeObjectCreator.class) {
                    mInstance = new BillPugh();
                }
            }
            return mInstance;
        }
    }

    public static BillPugh getInstance() {
        return ObjectCreator.INSTANCE;
    }

    public static BillPugh getInstanceWithThreadSafe() {
        return ThreadSafeObjectCreator.getmInstance();
    }
}
