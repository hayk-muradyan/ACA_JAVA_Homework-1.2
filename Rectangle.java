public class Rectangle implements Shape {
    private double height;
    private double width;
    public void setHeight(double height){
        if(height > 0)
            this.height = height;
    }
    public void setWidth(double width){
        if(width > 0)
            this.width = width;
    }
    public double calculatePerimeter(){
        return 2*(height + width);
    }
    public double calculateArea(){
        return height * width;
    }
}