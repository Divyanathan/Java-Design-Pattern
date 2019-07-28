package creational.pattern.prototype.patttern;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype design patter is used to avoid the extra object creation
 * Instead of creating new object make use of the exist object and set the value according our requirement
 * <p>
 * We can use the clone method to get the copy of the object
 * But here i have created a method call getCopy which returns the copy of the object
 */
public class PrototypeExample {

    List<String> mNameList = new ArrayList<>();

    public PrototypeExample() {
    }

    public PrototypeExample(List<String> pNameList) {
        mNameList = pNameList;
    }

    public void init() {
        mNameList.add("Raj");
        mNameList.add("Ram");
        mNameList.add("Ravi");
        mNameList.add("Rajesh");
    }

    public List<String> getmNameList() {
        return mNameList;
    }

    public void setmNameList(List<String> pNameList) {
        mNameList = pNameList;
    }

    public PrototypeExample getCopy() {
        return new PrototypeExample(new ArrayList<>(mNameList));
    }

}


class Demo {

    public static void main(String[] args) {

        PrototypeExample lPrototypeExample = new PrototypeExample();
        lPrototypeExample.init();
        PrototypeExample lCopy = lPrototypeExample.getCopy();
        lCopy.getmNameList().add("Kumar");
        lPrototypeExample.getmNameList().add("sathis");
        lCopy.getmNameList().remove("Raj");
        System.out.println(lPrototypeExample.getmNameList().toString());
        System.out.println(lCopy.getmNameList().toString());

    }

}

