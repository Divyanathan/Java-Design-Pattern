package structural.pattern.adapter;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle shape");
    }

    @Override
    public void reSize() {
        System.out.println("Resizing  Rectangle shape");
    }
}
