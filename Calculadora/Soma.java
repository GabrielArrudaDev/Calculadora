package Calculadora;

public class Soma {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int resultado = somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }
}

