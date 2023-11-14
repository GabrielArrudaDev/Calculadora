package Calculadora;

/**
 * @author: Gabriel Arruda
 * @version: 1.0
 * @since: Release 1.0 da aplicação
 *
 * Classe que implementa a funcionalidade de divisão de dois números inteiros.
 * Também trata a exceção de divisão por zero.
 *
 */
public class Divisao {

    /**
     * Método para dividir dois números inteiros (com tratamento de exceção).
     *
     * @param a O número inteiro a ser dividido.
     * @param b O número inteiro divisor.
     * @return O resultado da divisão entre os dois números como double.
     * @throws ArithmeticException Se o divisor for zero.
     */
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}
