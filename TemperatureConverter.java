public class TemperatureConverter {
    public double convertFarenheitToCelsius(double F){
        return (F - 32) * 5 / 9 ;
    }
    public double convertFarenheitToKelvin(double F){
        return (F - 32) * 5 / 9 + 273.15 ;
    }

    public double convertCelsiusToFarenheit(double C){
        return C * 9/5 + 32;
    }
    public double convertCelsiusToKelvin(double C){
        return C  + 273.15;
    }

    public double convertKelvinToCelsius(double K){
        return K -  273.15;
    }
    public double convertKelvinToFarenheit(double K){
        return (K - 273.15) * 9/5 + 32;
    }
}
