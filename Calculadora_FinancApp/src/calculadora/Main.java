package calculadora;

import java.util.Scanner;

/**
 * @author Thomás Ribeiro Jacomaci
 * @version 1.0
 */
public class Main {

    /**
     * @param args 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        try {
            System.out.println("CALCULADORA FINANÇAPP");

            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();

            double resultado = calculadora.calc(primeiroNumero, segundoNumero, operacao);

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Erro: digite números válidos.");
        }

        scanner.close();
    }
}
