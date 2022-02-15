import java.util.Date;
public class geometricObject {
    public String color;
    public boolean filled;
    public java.util.Date dateCreated;

    public geometricObject(){
        this.color="white";
        this.filled=false;
        this.dateCreated=new java.util.Date();
    }
    public geometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated=new java.util.Date();
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }
    public String toString(){
        return "created on "+ this.dateCreated + "\n" + "color: "+ this.color + " and filled: " + this.filled;
    }

}
