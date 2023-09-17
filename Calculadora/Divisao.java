package Calculadora;

public class Divisao {
    // Método para dividir dois números inteiros (com tratamento de exceção)
    public static double dividir(int a, int b) {
        if (b != 0) { // Verifica se o divisor não é zero
            return (double) a / b; // Realiza a operação de divisão entre 'a' e 'b' e retorna o resultado como double
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida."); // Lança uma exceção se o divisor for zero
        }
    }
}
