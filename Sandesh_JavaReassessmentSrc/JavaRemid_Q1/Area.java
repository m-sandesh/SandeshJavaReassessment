// Creating class: Area inheriting the abstract class: Shape
class Area extends Shape {
    public double rectangleArea(double length, double breadth) {
        return length * breadth;
    }
   
    public double squareArea(double side) {
        return side * side;
    }
   
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}