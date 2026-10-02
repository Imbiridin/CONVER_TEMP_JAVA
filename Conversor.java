
class Conversor {

    private double fahrenheit;
    private double celsius;
    private double kelvin;

    public double getFahrenheitCelsius() {
        return (fahrenheit - 32) / 1.8;
    }

    public double getFahrenheitKelvin() {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setCelcius(double celsius) {
        double resultado_f = (celsius * 1.8) + 32;
        double resultado_k = celsius + 273.15;
    }

    public void setKelvin(double kelvin) {
        double resultado_c = kelvin - 273.15;
        double resultado_f = (kelvin - 273.15) * 1.8 + 32;
    }

}
