package creational.pattern.singleton.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * The First rule to create Singleton Object is set the Constructor access specifier as private
 * What if the that can change to public from outside the class. If the that happened they can create N number of object
 * Access specifier can changed to public that concept is called as Reflection using which Single ton can be destroy
 */
public class ReflectionToDestroy {

    public static void main(String[] args) {
        EagerInitialization mInstanceOne = EagerInitialization.getInstance();
        EagerInitialization mInstanceTwo = null;
        Constructor[] mConstructor = EagerInitialization.class.getDeclaredConstructors();
        for (Constructor lConstructor : mConstructor) {
            lConstructor.setAccessible(true);
            try {
                mInstanceTwo = (EagerInitialization) lConstructor.newInstance();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("InstanceOne Hashcode " + mInstanceOne.hashCode());
        System.out.println("InstanceTwo Hashcode " + mInstanceTwo.hashCode());
    }
}
