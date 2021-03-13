public class Currencies {
    protected double value;
    public void set(double v) {
        if( v > 0 )
            value = v;
    }
    public double get() {
        return  value;
    }
}
class Dram extends Currencies {
}
class Ruble extends Currencies {
}
class Dollar extends Currencies {
}
