package structural.pattern.adapter;

public class Triangle implements GeometricShape{

    double mBase, mHeight;

    Triangle(){
        this(2,2);
    }

    public Triangle(double pBase, double pHeight) {
        mBase = pBase;
        mHeight = pHeight;
    }

    @Override
    public double area() {
        return (double) ((mBase * mHeight)/2);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the Triangle shape with area :"+area());
    }
}
