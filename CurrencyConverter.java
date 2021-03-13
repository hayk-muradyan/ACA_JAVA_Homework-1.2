public class CurrencyConverter {
    void convert(Dram from,Ruble to){
        to.set(from.get() * 15/100);
    }
    void convert(Dram from,Dollar to){
        to.set(from.get() * 21/10000 );
    }
    void convert(Ruble from,Dram to){
        to.set(from.get() * 7.19);
    }
    void convert(Ruble from,Dollar to){
        to.set(from.get() * 14/1000);
    }
    void convert(Dollar from,Dram to){
        to.set(from.get() * 526.63);
    }
    void convert(Dollar from,Ruble to){
        to.set(from.get() * 73.26);
    }
}
