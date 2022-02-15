public class Square extends Shape{

    public Square(double length, double height){
        super.dim1=length;
        super.dim2=height;
    }
    public double area(){
        System.out.println("Inside Area for Square.");
        return super.dim1*super.dim2;
    }
}
