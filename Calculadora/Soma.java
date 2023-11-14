package Calculadora;

/**
 * @author: Gabriel Arruda
 * @version: 1.05
 * @since: Release 1.0 da aplicação
 *
 * Classe que implementa a funcionalidade de soma de dois números inteiros.
 */
public class Soma {

    /**
     * Método estático para somar dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser somado.
     * @param b O segundo número inteiro a ser somado.
     * @return O resultado da soma entre os dois números.
     */
    public static int somar(int a, int b) {
        return a + b;
    }

    /**
     * Método principal (main) que demonstra a utilização do método 'somar'.
     * Define dois números, executa a soma e exibe o resultado na saída padrão.
     */
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        // Realiza a soma usando o método 'somar' da classe 'Soma'
        int resultado = somar(numero1, numero2);

        // Exibe o resultado da soma na saída padrão
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }
}
