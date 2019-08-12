package structural.pattern.adapter;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle shape");
    }

    @Override
    public void reSize() {
        System.out.println("Resizing  Circle shape");
    }
}
