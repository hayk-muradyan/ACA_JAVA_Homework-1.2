public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    public void setSideA(double sideA){
        if(sideA > 0)
            this.sideA = sideA;
    }
    public void setSideB(double sideB){
        if(sideB > 0)
            this.sideB = sideB;
    }
    public void setSideC(double sideC){
        if(sideC > 0)
            this.sideC = sideC;
    }

    private boolean isValid() {
        if((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            return true;
        }else {
            return false;
        }
    }

    public double calculatePerimeter(){
        if(!isValid())
            return 0;
        return sideA + sideB + sideC;
    }
    public double calculateArea(){
        if(!isValid())
            return 0;
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt( p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}