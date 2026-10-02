
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("=".repeat(30));
        System.out.println("Digite Fahrenheit[F], Celsius[C], Kelvin[K]");
        String sigla = sc.nextLine().toLowerCase();
        System.out.println("=".repeat(30));

        switch (sigla) {
            case "f" -> {
                System.out.println("Digite qual temperatura você gostaria de converter Celcius[c] ou Kelvin[k]: ");
                String sigla_1 = sc.nextLine().toLowerCase();

                switch (sigla_1) {
                    case "c" -> {
                        System.out.println("Digite a temperatura em Fahrenheit para converter em Celsius: ");
                        double fahrenheit = sc.nextDouble();
                        double resultado = (fahrenheit - 32) / 1.8;
                        System.out.println("O resultado é: " + resultado);
                    }

                    case "k" -> {
                        System.out.println("Digite a temperatura em Fahreinheit para converter em Kelvin");
                        double fahrenheit = sc.nextDouble();
                        double resultado = (fahrenheit - 32) * 5 / 9 + 273.15;
                        System.out.println("O resultado é: " + resultado);
                    }

                    default -> System.out.println("Operador não encontrado!");
                }
            }

            case "c" -> {
                System.out.println("Digite qual temperatura você gostaria de converter Fahreinheit[f] ou Kelvin[k]: ");
                String sigla_1 = sc.nextLine().toLowerCase();

                switch (sigla_1) {
                    case "f" -> {
                        System.out.println("Digite a temperatura em Celsius para converter em Fahrenheit: ");
                        double celsius = sc.nextDouble();
                        double resultado = (celsius * 1.8) + 32;
                        System.out.println("O resultado é: " + resultado);
                    }

                    case "k" -> {
                        System.out.println("Digite a temperatura em Celsius para converter em Kelvin: ");
                        double celsius = sc.nextDouble();
                        double resultado = celsius + 273.15;
                        System.out.println("O resultado é: " + resultado);
                    }

                    default -> System.out.println("Operador não encntrado!");
                }
            }

            case "k" -> {
                System.out.println("Digite qual temperatura você gostaria de converter Fahreinheit[f] ou Celsius[c]: ");
                String sigla_1 = sc.nextLine().toLowerCase();

                switch (sigla_1) {
                    case "c" -> {
                        System.out.println("Digite a temperatura em Kelvin para converter em Celsius: ");
                        double kelvin = sc.nextDouble();
                        double resultado = kelvin - 273.15;
                        System.out.println("O resultado é: " + resultado);
                    }

                    case "f" -> {
                        System.out.println("Digite a temperatura em Kelvin para converter em Celsius: ");
                        double kelvin = sc.nextDouble();
                        double resultado = (kelvin - 273.15) * 1.8 + 32;
                        System.out.println("O resultado é: " + resultado);
                    }

                    default -> System.out.println("Operador não encontrado!");
                }
            }

            default -> System.out.println("Operador não encontrado!");
        }

    }
}
