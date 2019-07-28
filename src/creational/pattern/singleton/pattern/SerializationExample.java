package creational.pattern.singleton.pattern;

import java.io.*;

/**
 * Some time we need to implement Serializable in order to pass to other class.
 * But problem with Serialization when you DeSerialize object it creates the new instance.
 * In order to avoid that we suppose use #readResolve method
 *
 * <p>
 * <p>
 * -------------------------------Points to noted when it comes to Singleton--------------------------------
 * ---> set the Constructor access modifier as private so the Object can't created from outside of the class
 * ---> Since we can't create the from outside need to create the object within the class
 * ---> Then crate a static method to return the instance
 * ---------------------------------------------------------------------------------------------------------
 */

public class SerializationExample implements Serializable {

    private SerializationExample() {

    }

    private static class ObjectCreator {
        private static final SerializationExample INSTANCE = new SerializationExample();
    }

    public static SerializationExample getInstance() {
        return ObjectCreator.INSTANCE;
    }

    protected  Object readResolve(){
        return ObjectCreator.INSTANCE;
    }
}

class DemoSerializable {
    public static void main(String[] args) throws Exception {
        SerializationExample lInstanceSerializable = SerializationExample.getInstance();
        ObjectOutput lObjectOutput = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        lObjectOutput.writeObject(lInstanceSerializable);
        lObjectOutput.close();
        ObjectInput lObjectInput = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializationExample lInstanceDeSerializable = (SerializationExample) lObjectInput.readObject();
        lObjectInput.close();
        System.out.println("HashCode Serializable " + lInstanceSerializable.hashCode());
        System.out.println("HashCode DeSerializable " + lInstanceDeSerializable.hashCode());
    }
}
