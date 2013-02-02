package CalculatorModels;

/**
 *
 * @author Emma Edgar
 */
public class CircleCalculator {

    private double radius;
    private final double PI = 3.14159265359;
    private double area;
    private final String RESULTS_MSG = "The area of the circle is ";
    
    public CircleCalculator(double radius) {
        this.radius = radius;
        this.area = PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public String getResultsMessage(){
        return RESULTS_MSG + area;
    }
    
}
