public class Circle implements Shape {
    private double radius;
    public void setRadius(double radius){
        if(radius > 0)
        this.radius = radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
