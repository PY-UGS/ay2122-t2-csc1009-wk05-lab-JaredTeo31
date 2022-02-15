public class Circle extends Shape{

    public Circle(double radius, double radius2){
        super.dim1 = radius;
        super.dim2 = radius2;
    }
    public double area(){
        System.out.println("Inside Area for Circle.");
        return super.PI * super.dim1 * super.dim2;
    }
}
