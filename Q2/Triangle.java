public class Triangle extends Shape{

    public Triangle(double length, double height){
        super.dim1=length;
        super.dim2=height;
    }
    public double area(){
        System.out.println("Inside Area for Triangle.");
        return 0.5*super.dim1*super.dim2;
    }
}
