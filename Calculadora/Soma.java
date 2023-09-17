package Calculadora;

public class Soma {
    // Método para somar dois números inteiros
    public static int somar(int a, int b) {
        return a + b; // Realiza a operação de soma entre 'a' e 'b' e retorna o resultado
    }

    public static void main(String[] args) {
        int numero1 = 10; // Define o primeiro número como 10
        int numero2 = 5;  // Define o segundo número como 5

        // Chama o método "somar" da classe "Soma" com os números definidos acima
        int resultado = somar(numero1, numero2);

        // Exibe o resultado da soma na saída padrão
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }
}
