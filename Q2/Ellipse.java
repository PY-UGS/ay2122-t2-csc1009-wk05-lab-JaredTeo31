public class Ellipse extends Shape{

    public Ellipse(double minor, double major){
        super.dim1 = minor;
        super.dim2 = major;
    }
    public double area(){
        System.out.println("Inside Area for Ellipse.");
        return super.PI * super.dim1 * super.dim2;
    }
}
