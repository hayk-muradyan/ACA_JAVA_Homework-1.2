public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////
        //Circle
        Circle crc = new Circle();
        crc.setRadius(5);
        System.out.println(crc.calculatePerimeter());
        System.out.println(crc.calculateArea());
        ////////////////////////////////////
        //Rectangle
        Rectangle rect = new Rectangle();
        rect.setHeight(4);
        rect.setWidth(5);
        System.out.println(rect.calculatePerimeter());
        System.out.println(rect.calculateArea());
        ////////////////////////////////////
        //Triangle
        Triangle triangle = new Triangle();
        triangle.setSideA(5);
        triangle.setSideB(5);
        triangle.setSideC(6);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        ////////////////////////////////////
        //Point
        Point p1 = new Point(3,-4);
        Point p2 = new Point(-1,-1);
        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
        ////////////////////////////////////
        //TemperatureConverter
        TemperatureConverter TC = new TemperatureConverter();
        System.out.println(TC.convertCelsiusToFarenheit(12));
        System.out.println(TC.convertCelsiusToKelvin(12));
        System.out.println(TC.convertFarenheitToCelsius(93));
        System.out.println(TC.convertFarenheitToKelvin(93));
        System.out.println(TC.convertKelvinToCelsius(300));
        System.out.println(TC.convertKelvinToFarenheit(300));
        ////////////////////////////////////
        //DistanceConverter
        DistanceConverter DC = new DistanceConverter();
        System.out.println(DC.convertMetersToMiles(4567));
        System.out.println(DC.convertMilesToMeters(2));
        ////////////////////////////////////
        //CurrencyConverter
        Dram dram = new Dram();
        dram.set(1500);
        Ruble ruble = new Ruble();
        ruble.set(110);
        Dollar dollar = new Dollar();
        dollar.set(12);
        Dram dram1 = new Dram();
        Ruble ruble1 = new Ruble();
        Dollar dollar1 = new Dollar();
        CurrencyConverter CC = new CurrencyConverter();
        CC.convert(dram,ruble1);
        System.out.println(ruble1.get());
        CC.convert(dram,dollar1);
        System.out.println(dollar1.get());
        CC.convert(ruble,dram1);
        System.out.println(dram1.get());
        CC.convert(ruble,dollar1);
        System.out.println(dollar1.get());
        CC.convert(dollar,dram1);
        System.out.println(dram1.get());
        CC.convert(dollar,ruble1);
        System.out.println(ruble1.get());

        ////////////////////////////////////
        //Movie
        int max = 0;
        char str = 'A';
        Movie movies[] = new Movie[10];
        for(int i = 0; i < 10; i++){
            int r = (int) (Math.random()*10);
            if(max < r)
                max = r;
            str++;
            movies[i] = new Movie(Character.toString(str),r);
        }
        for(Movie m : movies){
            if(m.getRating() == max)
                System.out.println(m.getTitle());
        }
    }
}
