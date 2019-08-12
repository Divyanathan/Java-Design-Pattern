package structural.pattern.adapter;

/**
 * So far, so good. As we progress, we come to know that there are some extra geometric shapes that are already developed
 * Either by some other team within our organization. Or, we have mBase third-party API, which is available to us.
 */
public interface GeometricShape {
    /**
     * This method is used to find the area of given shape
     * @return
     */
    double area();

    /**
     * This method is used to draw the shape of given shape
     */
    void drawShape();
}
