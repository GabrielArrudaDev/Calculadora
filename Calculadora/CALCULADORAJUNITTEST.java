package Calculadora;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CALCULADORAJUNITTEST {
    private int numero1; // Variável para armazenar o primeiro número
    private int numero2; // Variável para armazenar o segundo número

    // Método de configuração executado antes de cada teste
    @Before
    public void setUp() {
        numero1 = 10; // Inicializa o primeiro número com 10
        numero2 = 5;  // Inicializa o segundo número com 5
    }

    @Test
    public void testSoma() {
        // Teste da operação de soma
        int resultado = Soma.somar(numero1, numero2);
        assertEquals(15, resultado); // Verifica se o resultado é igual a 15
    }

    @Test
    public void testSubtracao() {
        // Teste da operação de subtração
        int resultado = Subtracao.subtrair(numero1, numero2);
        assertEquals(5, resultado); // Verifica se o resultado é igual a 5
    }

    @Test
    public void testMultiplicacao() {
        // Teste da operação de multiplicação
        int resultado = Multiplicacao.multiplicar(numero1, numero2);
        assertEquals(50, resultado); // Verifica se o resultado é igual a 50
    }

    @Test
    public void testDivisao() {
        // Teste da operação de divisão
        double resultado = Divisao.dividir(numero1, numero2);
        assertEquals(2.0, resultado, 0.001); // Verifica se o resultado é igual a 2.0 com precisão de 0.001
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        // Teste de divisão por zero (espera-se que lance uma exceção)
        Divisao.dividir(numero1, 0);
    }

    @Test
    public void testSubtracaoNegativa() {
        // Teste de subtração com resultado negativo
        int resultado = Subtracao.subtrair(5, 10);
        assertEquals(-5, resultado); // Verifica se o resultado é igual a -5
    }

    @Test
    public void testDivisaoNegativa() {
        // Teste de divisão com resultado negativo
        double resultado = Divisao.dividir(-15, 3);
        assertEquals(-5.0, resultado, 0.001); // Verifica se o resultado é igual a -5.0 com precisão de 0.001
    }

    @Test
    public void testMultiplicacaoZero() {
        // Teste de multiplicação com resultado zero
        int resultado = Multiplicacao.multiplicar(5, 0);
        assertEquals(0, resultado); // Verifica se o resultado é igual a 0
    }
}


