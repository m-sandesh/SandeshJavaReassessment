public class Main {
    public static void main(String[] args) {
        // Creating the object 
        Area calculate = new Area();

        // Calling the methods to calculate and printing the output
        System.out.println("Area of rectangle: " + calculate.rectangleArea(10.0, 5.0));
        System.out.println("Area of square: " + calculate.squareArea(8.0));
        System.out.println("Area of circle: " + calculate.circleArea(4.0));
    }
}
