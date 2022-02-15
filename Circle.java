public class Circle extends geometricObject {
    public double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public double getDiameter(){
        return 2 * this.radius;
    }
    public void printCircle(){
        System.out.println("Radius of circle: " + this.radius + "Diameter of circle: " + this.getDiameter() + "Area of Circle: "+ this.getArea());
    }
}
