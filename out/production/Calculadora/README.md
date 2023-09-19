# Calculadora Java com Testes JUnit

## Descrição do Projeto

Este projeto é uma calculadora simples em Java que realiza operações matemáticas básicas, como adição, subtração, multiplicação e divisão. O principal objetivo deste projeto é demonstrar o uso de testes unitários com a biblioteca JUnit para garantir a precisão das operações e lidar com cenários especiais, como divisão por zero.

## Implementação

O projeto é implementado em Java e segue uma estrutura organizada para facilitar a compreensão e manutenção do código:

- **src/Calculadora**: Contém as classes responsáveis pelas operações matemáticas (Soma, Subtracao, Multiplicacao, Divisao).
- **test/Calculadora**: Contém as classes de teste JUnit (CALCULADORAJUNITTEST) para verificar a precisão das operações matemáticas e lidar com casos especiais.

As operações matemáticas são implementadas de maneira simples, e cada classe tem um método estático correspondente que realiza a operação desejada.

## Testes JUnit

Os testes unitários são uma parte essencial deste projeto para garantir que as operações matemáticas funcionem corretamente e produzam resultados precisos. As classes de teste JUnit estão localizadas na pasta `test/Calculadora` e incluem testes para:

- Soma de números inteiros.
- Subtração de números inteiros.
- Multiplicação de números inteiros.
- Divisão de números inteiros, incluindo casos de divisão por zero.
- Cenários com números negativos.

Os testes são executados antes de qualquer alteração no código-fonte e ajudam a detectar regressões e erros em potencial.

## Como Executar

Para executar os testes JUnit deste projeto, siga estas etapas:

1. Clone o repositório ou baixe o código-fonte.
2. Abra o projeto em sua IDE Java (como Eclipse, IntelliJ IDEA, etc.).
3. Execute a classe `CALCULADORAJUNITTEST` como um teste JUnit. Isso irá verificar a precisão das operações matemáticas e exibir os resultados dos testes no console.

## Contribuição

Este projeto é de código aberto e aceita contribuições da comunidade. Se você deseja adicionar novas funcionalidades, melhorar o código existente ou corrigir problemas, sinta-se à vontade para criar um fork do projeto e enviar um pull request com suas alterações.

## Licença

Este projeto é licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

Este projeto foi desenvolvido por [Seu Nome].


