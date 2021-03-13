import java.lang.Math;
public class Point {
    private double x;
    private double y;
    public double distance(){
        double z = x*x + y*y;
        return Math.sqrt(z);
    }
    public double distance(Point p){
        double z = Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y,2));
        return z;
    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
}