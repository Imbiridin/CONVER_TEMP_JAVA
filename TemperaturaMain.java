
import javax.swing.JOptionPane;

class TemperaturaMain {

    public static void main(String[] args) {
        Conversor cv = new Conversor();

        JOptionPane.showMessageDialog(null, "CONVERSOR DE TEMPERATURA \n");

        String opcaoT = JOptionPane.showInputDialog("Fahrenheit[F] | Celsius[C] | Kelvin[K]").toLowerCase();

        switch (opcaoT) {
            case "f":
                String fahrenheit = JOptionPane.showInputDialog("Digite qual temperatura você gostaria de converter Celcius[c] ou Kelvin[k]: ").toLowerCase();
                switch (fahrenheit) {
                    case "c":
                        String celsiusT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Celsius: ");
                        cv.setFahrenheit(Double.parseDouble(celsiusT));
                        JOptionPane.showMessageDialog(null, cv.getFahrenheitCelsius());
                        break;

                    case "k":
                        String kelvinT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Kelvins: ");
                        cv.setKelvin(Double.parseDouble(kelvinT));
                        JOptionPane.showMessageDialog(null, cv.getFahrenheitKelvin());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Informação inválida!");
                }
            break;
            case "c":
                String celsius = JOptionPane.showInputDialog("Digite qual temperatura você gostaria de converter Fahreinheit[f] ou Kelvin[k]: ").toLowerCase();
                switch (celsius) {
                    case "f":
                        String fahreinheitT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Fahreinheit: ");
                        cv.setFahrenheit(Double.parseDouble(fahreinheitT));
                        JOptionPane.showMessageDialog(null, cv.getCelsiusFahrenheit());
                        break;

                    case "k":
                        String kelvinT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Kelvin: ");
                        cv.setKelvin(Double.parseDouble(kelvinT));
                        JOptionPane.showMessageDialog(null, cv.getCelsiusKelvin());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Informação inválida!");
                }
            break;
            case "k":
                String kelvin = JOptionPane.showInputDialog("Digite qual temperatura você gostaria de converter Fahreinheit[f] ou Celsius[c]: ").toLowerCase();
                switch (kelvin) {
                    case "c":
                        String celsiusT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Celsius: ");
                        cv.setCelcius(Double.parseDouble(celsiusT));
                        JOptionPane.showMessageDialog(null, cv.getKelvinCelsius());
                        break;

                    case "f":
                        String fahrenheitT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Fahreinheit: ");
                        cv.setFahrenheit(Double.parseDouble(fahrenheitT));
                        JOptionPane.showMessageDialog(null, cv.getKelvinFahrenheit());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Informação inválida!");
                }
            break;

        }

    }
}
