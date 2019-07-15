package creational.pattern.factory.method.pattern;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Please enter the project name");
        String lProjectName;
        do {
            lProjectName = lScanner.next();
        } while (new FactoryMethodPattern().getHttHelper(lProjectName) == null);
    }
}
