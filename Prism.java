public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }
    
    public double getVolume(){
	return length*width*height;
    }//getVolume

    public String toString(){
	return "Prism "+getName()+ " that is " + length " by " + width + "by" + height;
    }
}