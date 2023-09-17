package Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        // Teste da classe Soma
        int resultadoSoma1 = Soma.somar(10, 5); // Chama o método "somar" da classe "Soma" com argumentos 10 e 5
        System.out.println("A soma de 10 e 5 é igual a " + resultadoSoma1); // Exibe o resultado da soma

        // Teste da classe Subtracao
        int resultadoSubtracao1 = Subtracao.subtrair(10, 5); // Chama o método "subtrair" da classe "Subtracao" com argumentos 10 e 5
        System.out.println("A subtração de 10 e 5 é igual a " + resultadoSubtracao1); // Exibe o resultado da subtração

        // Teste da classe Multiplicacao
        int resultadoMultiplicacao1 = Multiplicacao.multiplicar(7, 3); // Chama o método "multiplicar" da classe "Multiplicacao" com argumentos 7 e 3
        System.out.println("A multiplicação de 7 e 3 é igual a " + resultadoMultiplicacao1); // Exibe o resultado da multiplicação

        // Teste de divisão por zero com tratamento de exceção
        try {
            double resultadoDivisao1 = Divisao.dividir(10, 0); // Tenta dividir 10 por 0 (o que lança uma exceção)
            System.out.println("A divisão de 10 por 0 é igual a " + resultadoDivisao1); // Não será executado devido à exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir: " + e.getMessage()); // Exibe uma mensagem de erro de divisão por zero
        }

        // Teste de subtração com números negativos
        int resultadoSubtracao2 = Subtracao.subtrair(-5, -10); // Chama o método "subtrair" com números negativos
        System.out.println("A subtração de -5 e -10 é igual a " + resultadoSubtracao2); // Exibe o resultado da subtração

        // Teste de divisão com número negativo
        double resultadoDivisao2 = Divisao.dividir(15, -3); // Chama o método "dividir" com números positivos e negativos
        System.out.println("A divisão de 15 por -3 é igual a " + resultadoDivisao2); // Exibe o resultado da divisão

        // Teste de multiplicação com resultado zero
        int resultadoMultiplicacao2 = Multiplicacao.multiplicar(5, 0); // Chama o método "multiplicar" com um zero
        System.out.println("A multiplicação de 5 e 0 é igual a " + resultadoMultiplicacao2); // Exibe o resultado da multiplicação
    }
}
