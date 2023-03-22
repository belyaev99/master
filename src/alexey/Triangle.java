/**
 * @author belyaev99
 */
package alexey;
//класс triangle наследниу класса figure
public class Triangle implements Figure {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }//определенные переменные, стороны треугольника
    //класс triangle наследниу класса figure

    @Override
    public double getSquare() {
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }//формула герона для вычисления площади

    @Override
    public double getPerimeter() {
        return a + b + c;
    }//формула периметра треугольника

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
