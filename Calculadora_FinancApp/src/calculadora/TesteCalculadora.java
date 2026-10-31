package calculadora;

/**
 * @author Thomás Ribeiro Jacomaci
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("TESTE DE SOMA");
        System.out.println("Entrada: 8 + 3");
        System.out.println("Resultado esperado: 11");
        System.out.println("Resultado obtido: " + calculadora.calc(8, 3, "+"));

        System.out.println();

        System.out.println("TESTE DE SUBTRAÇÃO");
        System.out.println("Entrada: 15 - 4");
        System.out.println("Resultado esperado: 11");
        System.out.println("Resultado obtido: " + calculadora.calc(15, 4, "-"));

        System.out.println();

        System.out.println("TESTE DE MULTIPLICAÇÃO");
        System.out.println("Entrada: 6 * 7");
        System.out.println("Resultado esperado: 42");
        System.out.println("Resultado obtido: " + calculadora.calc(6, 7, "*"));

        System.out.println();

        System.out.println("TESTE DE DIVISÃO");
        System.out.println("Entrada: 20 / 4");
        System.out.println("Resultado esperado: 5");
        System.out.println("Resultado obtido: " + calculadora.calc(20, 4, "/"));

        System.out.println();

        System.out.println("TESTE DE DIVISÃO POR ZERO");
        System.out.println("Entrada: 9 / 0");
        System.out.println("Resultado esperado: mensagem de erro");
        System.out.println("Resultado obtido: " + calculadora.calc(9, 0, "/"));

        System.out.println();

        System.out.println("TESTE DE OPERAÇÃO INVÁLIDA");
        System.out.println("Entrada: 12 % 3");
        System.out.println("Resultado esperado: mensagem de operação inválida");
        System.out.println("Resultado obtido: " + calculadora.calc(12, 3, "%"));
    }
}
