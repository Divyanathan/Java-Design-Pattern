package creational.pattern.singleton.pattern;

/**
 * StaticBlock Singleton is also Eager initialization  but here we are using static block to create an object
 * Since we are using static block here we can handle Exception
 * And the object creation will happen  when the class is loading
 * <p>
 * <p>
 * -------------------------------Points to noted when it comes to Singleton--------------------------------
 * ---> set the Constructor access modifier as private so the Object can't created from outside of the class
 * ---> Since we can't create the from outside need to create the object within the class
 * ---> Then crate a static method to return the instance
 * ---------------------------------------------------------------------------------------------------------
 */
public class StaticBlock {
    private static StaticBlock mInstance;

    static {
        try {
            mInstance = new StaticBlock();
        } catch (Exception e) {
            System.out.println("Error while creating Object");
            e.printStackTrace();
        }
    }

    private StaticBlock(){

    }
    public static StaticBlock getInstance() {
        return mInstance;
    }
}
