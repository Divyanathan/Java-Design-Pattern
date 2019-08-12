package structural.pattern.adapter;

public class GeometricShapeAdapter implements Shape {

    GeometricShape mGeometricShape;

    public GeometricShapeAdapter(GeometricShape mGeometricShape) {
        this.mGeometricShape = mGeometricShape;
    }

    @Override
    public void draw() {
        mGeometricShape.drawShape();
    }

    @Override
    public void reSize() {
        geometricShapeReSize();
    }

    private void geometricShapeReSize() {
        if (mGeometricShape instanceof Square)
            System.out.println("Resizing  Square shape");
        else if (mGeometricShape instanceof Triangle)
            System.out.println("Resizing  Triangle shape");
    }
}


class ObjectAdapterDemo{

    public static void main(String[] args) {
        Drawing lDrawing = new Drawing();
        lDrawing.addShape(new Circle());
        lDrawing.addShape(new Rectangle());
        lDrawing.addShape(new GeometricShapeAdapter(new Square(8)));
        lDrawing.addShape(new GeometricShapeAdapter(new Triangle(4,8)));
        lDrawing.drawShape();
        lDrawing.reSizeShape();
    }

}