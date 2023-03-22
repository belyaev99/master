package alexey;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);//задание радиуса круга
        System.out.println(circle.getSquare());//вывод площади круга
        System.out.println(circle.getPerimeter());//вывод периметра круга
        Rectangle rectangle = new Rectangle(10, 15);//задание сторон прямоугольника
        System.out.println(rectangle.getSquare());//вывод площади прямоугольника
        System.out.println(rectangle.getPerimeter());//вывод периметра прямоугольника
        Triangle triangle = new Triangle(2, 3, 4);//задание сторон треугольника
        System.out.println(triangle.getSquare());//вывод площади треугольника
        System.out.println(triangle.getPerimeter());//вывод периметра треугольника
        Ellipse ellipse = new Ellipse(4, 9);//задание осей элипса
        System.out.println(ellipse.getSquare());//вывод площади элипса
        System.out.println(ellipse.getPerimeter());//вывод периметра элипса
    }
}//класс main