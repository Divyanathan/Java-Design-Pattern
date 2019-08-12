package structural.pattern.adapter;

public class TriangleAdapter extends Triangle implements  Shape {

    public TriangleAdapter(double pBase, double pHeight) {
        super(pBase, pHeight);
    }

    @Override
    public void draw() {
        super.drawShape();
    }

    @Override
    public void reSize() {
        geometricShapeReSize();
    }

    private void geometricShapeReSize() {
        System.out.println("Resizing  Triangle shape");
    }
}

class ClassAdapterDemo {

    public static void main(String[] args) {
        Drawing lDrawing = new Drawing();
        lDrawing.addShape(new Circle());
        lDrawing.addShape(new Rectangle());
        lDrawing.addShape(new TriangleAdapter(9,6));

        lDrawing.drawShape();
        lDrawing.reSizeShape();
    }
}


