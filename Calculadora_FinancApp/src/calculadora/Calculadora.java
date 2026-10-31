package calculadora;

/**
 * @author Thomás Ribeiro Jacomaci
 * @version 1.0
 */
public class Calculadora {

    /**
     * @param a
     * @param b 
     * @param op 
     * @return 
     */
    public double calc(int a, int b, String op) {

        if (op.equals("+")) {
            return a + b;
        }

        else if (op.equals("-")) {
            return a - b;
        }

        else if (op.equals("*")) {
            return a * b;
        }

        else if (op.equals("/")) {

            if (b == 0) {
                System.out.println("Erro: não é possível dividir por zero.");
                return 0;
            }

            return (double) a / b;
        }

        else {
            System.out.println("Erro: operação inválida.");
            return 0;
        }
    }
}
