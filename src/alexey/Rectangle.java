package alexey;
//класс Rectangle наследник класса Figure
public class Rectangle implements Figure {
    private double a = 0;
    private double b =0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }//определенные переменные, стороны треугольника

    @Override
    public double getSquare() {
        return a*b;
    }//формула для вычисления площади прямоугольника

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }//формула для вычисления периметра прямоугольника

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
}
