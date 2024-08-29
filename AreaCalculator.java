class AreaCalculator {

    
    public double area(double side) {
        return side * side;
    }


    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        
        double squareSide = 4.0;
        System.out.println("Area of square: " + calculator.area(squareSide));

        double length = 5.0, width = 3.0;
        System.out.println("Area of rectangle: " + calculator.area(length, width));

        
        double radius = 2.5;
        System.out.println("Area of circle: " + calculator.area(radius, true));
    }
}
