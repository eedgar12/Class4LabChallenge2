package CalculatorModels;

/**
 *
 * @author Emma Edgar
 */
public class TriangleCalculator {

    private double side1;
    private double side2;
    private double hyp;
    private final String RESULTS_MSG = "The hypotenuse of the triangle is ";

    public TriangleCalculator(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hyp = (Math.sqrt((side1 * side1) + (side2 * side2)));
    }
    
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHyp() {
        return hyp;
    }

    public void setHyp(double hyp) {
        this.hyp = hyp;
    }
    
    public String getResultsMessage(){
        return RESULTS_MSG + hyp;
    }
    
}
