package structural.pattern.adapter;

public class Square implements GeometricShape {

    double mLength;

    public Square(){
        this(2);
    }
    public Square(double pLength) {
        mLength = pLength;
    }

    @Override
    public double area() {
        return mLength * mLength;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the square shape with area :"+area());
    }
}
