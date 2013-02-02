package CalculatorModels;

/**
 *
 * @author Emma Edgar
 */
public class RectangleCalculator {

    private double length;
    private double width;
    private double area;
    private final String RESULTS_MSG = "The area of the rectangle is ";

    public RectangleCalculator(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        area = width * length;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public String getResultsMessage(){
        return RESULTS_MSG + area;
    }
}
