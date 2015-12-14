public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return 3.14*(getRadius()*getRadius())*height;
    }

    public String toString(){
	return "Cylinder that is" + getLength()+" by " + getWidth()+" by " + getHeight();
    }
}