package structural.pattern.adapter;

enum  ShapeType{
    CIRCLE,RECTANGLE,SQUARE,TRIANGLE
}

public class TwoWayAdapter implements GeometricShape ,Shape {

    ShapeType mType;

    public TwoWayAdapter(ShapeType pType) {
        mType = pType;
    }

    @Override
    public double area() {
        double lArea = 0;
        switch (mType) {
            case CIRCLE:
            case RECTANGLE:
                break;
            case SQUARE:
                lArea = new Square().area();
                break;
            case TRIANGLE:
                lArea = new Triangle().area();
                break;
        }
        return lArea;
    }

    @Override
    public void drawShape() {
        draw();
    }

    @Override
    public void draw() {
        switch (mType) {
            case CIRCLE:
                new Circle().draw();
                break;
            case RECTANGLE:
                new Rectangle().draw();
                break;
            case SQUARE:
                new Square().drawShape();
                break;
            case TRIANGLE:
                new Triangle().drawShape();
                break;
        }
    }

    @Override
    public void reSize() {

        switch (mType) {
            case CIRCLE:
                new Circle().reSize();
                break;
            case RECTANGLE:
                new Rectangle().reSize();
                break;
            case SQUARE:
            case TRIANGLE:
                geometricResize();
                break;
        }
    }

    void geometricResize(){
        if (mType == ShapeType.SQUARE)
            System.out.println("Resizing Square shape ");
        else
            System.out.println("Resizing Triangle shape ");
    }
}

class TwoWayAdapterDemo{
    public static void main(String[] args) {
        Drawing lDrawing  = new Drawing();
        lDrawing.addShape(new TwoWayAdapter(ShapeType.CIRCLE));
        lDrawing.addShape(new TwoWayAdapter(ShapeType.RECTANGLE));
        lDrawing.addShape(new TwoWayAdapter(ShapeType.SQUARE));
        lDrawing.addShape(new TwoWayAdapter(ShapeType.TRIANGLE));
        lDrawing.drawShape();
        lDrawing.reSizeShape();
    }
}
