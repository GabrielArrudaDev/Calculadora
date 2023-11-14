# Calculadora Java com Testes JUnit

## Descrição do Projeto

Este projeto é uma calculadora simples em Java que realiza operações matemáticas básicas, como adição, subtração, multiplicação e divisão. O principal objetivo deste projeto é demonstrar o uso de testes unitários com a biblioteca JUnit para garantir a precisão das operações e lidar com cenários especiais, como divisão por zero.

## Implementação

O projeto é implementado em Java e segue uma estrutura organizada para facilitar a compreensão e manutenção do código:

- **src/Calculadora**: Contém as classes responsáveis pelas operações matemáticas (Soma, Subtracao, Multiplicacao, Divisao).
- **test/Calculadora**: Contém as classes de teste JUnit (CALCULADORAJUNITTEST) para verificar a precisão das operações matemáticas e lidar com casos especiais.

As operações matemáticas são implementadas de maneira simples, e cada classe tem um método estático correspondente que realiza a operação desejada.



## Testes JUnit

Aqui estão exemplos dos testes JUnit realizados no projeto:

### Soma de Números Inteiros Positivos

- Testa a operação de soma com números inteiros positivos.
- Resultado esperado: 10 + 5 = 15.

### Subtração de Números Inteiros Positivos

- Testa a operação de subtração com números inteiros positivos.
- Resultado esperado: 10 - 5 = 5.

### Multiplicação de Números Inteiros Positivos

- Testa a operação de multiplicação com números inteiros positivos.
- Resultado esperado: 7 * 3 = 21.

### Divisão de Números Inteiros Positivos

- Testa a operação de divisão com números inteiros positivos, incluindo casos de divisão por zero.
- Resultado esperado: 10 / 2 = 5.0.

### Teste de Subtração com Números Negativos

- Testa a subtração com resultado negativo.
- Resultado esperado: (-5) - (-10) = 5.

### Teste de Divisão com Números Negativos

- Testa a divisão com resultado negativo.
- Resultado esperado: (-15) / 3 = -5.0.

### Multiplicação com Resultado Zero

- Testa a operação de multiplicação com resultado zero.
- Resultado esperado: 5 * 0 = 0.



Os testes são executados antes de qualquer alteração no código-fonte e ajudam a detectar regressões e erros em potencial.

## Como Executar

Para executar os testes JUnit deste projeto, siga estas etapas:

1. Clone o repositório ou baixe o código-fonte.
2. Abra o projeto em sua IDE Java (como Eclipse, IntelliJ IDEA, etc.).
3. Execute a classe `CALCULADORAJUNITTEST` como um teste JUnit. Isso irá verificar a precisão das operações matemáticas e exibir os resultados dos testes no console.

## Código

Este projeto é de código aberto.

## Autor

Este projeto foi desenvolvido por Gabriel Arruda.

## Última atualização: 14/11/2023
