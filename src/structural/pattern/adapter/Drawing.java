package structural.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    List<Shape> mShapeList = new ArrayList<>();


    /**
     * This method is used to add the given shape to the list
     * @param pShape
     */
    public void addShape(Shape pShape){
        mShapeList.add(pShape);
    }


    /**
     * This method is used to draw the shape from the list
     */
    public void drawShape(){
        if (mShapeList.size()>0){
            for (Shape lShape :mShapeList){
                lShape.draw();
            }
        }else {
            System.out.println("List is empty ");
        }
    }

    /**
     * This method is used to reSize the shape from the lis
     */
    public void reSizeShape(){
        if (mShapeList.size()>0){
            for (Shape lShape : mShapeList){
                lShape.reSize();
            }
        }else {
            System.out.println("List is empty ");
        }
    }

}

class DrawingDemo{

    public static void main(String[] args) {
        Drawing lDrawing = new Drawing();
        lDrawing.addShape(new Circle());
        lDrawing.addShape(new Rectangle());
        lDrawing.drawShape();
        lDrawing.reSizeShape();
    }
}
