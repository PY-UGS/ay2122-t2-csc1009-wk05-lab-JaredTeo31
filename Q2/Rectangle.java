public class Rectangle extends Shape
{

    public Rectangle(double width, double height){
        super.dim1=width;
        super.dim2=height;
    }
    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return super.dim1*super.dim2;
    }
}
