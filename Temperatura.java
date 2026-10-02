
import javax.swing.JOptionPane;

class Temperatura {

    public static void main(String[] args) {
        Conversor cv = new Conversor();

        JOptionPane.showMessageDialog(null, "CONVERSOR DE TEMPERATURA \n");

        String opcaoT = JOptionPane.showInputDialog("Digite Fahrenheit[F], Celsius[C], Kelvin[K]").toLowerCase();

        switch (opcaoT) {
            case "f":
                String fahrenheitT = JOptionPane.showInputDialog("Digite qual temperatura você gostaria de converter Celcius[c] ou Kelvin[k]: ");
                switch(fahrenheitT){
                    case "c":
                        String celsiusT = JOptionPane.showInputDialog("Informe a a temperatura para converter para Celsius: ");
                        cv.setFahrenheit(Double.parseDouble(celsiusT));
                        JOptionPane.showConfirmDialog(null, cv.getFahrenheitCelsius());
                }


        }

    }
}
