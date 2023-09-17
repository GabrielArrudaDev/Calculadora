package Calculadora;

public class Divisao {
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}
