public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public getVolume(){
	return (4/3)*3.14*(radius*radius*radius);
    }

    public String toString(){
	return "Sphere " + getName()+ " with radius of " + getRadius();
    }
}