# Calculadora Simples em Java

Este projeto implementa uma calculadora simples em Java com funcionalidades básicas como soma, subtração, multiplicação e divisão. O programa apresenta um menu interativo que permite ao usuário escolher qual operação deseja realizar e processa a entrada de dois números para cada cálculo. Ele continua em execução até que o usuário escolha a opção de encerrar o sistema.

# Funcionalidades
- Soma: Adiciona dois números fornecidos pelo usuário.
- Subtração: Subtrai o segundo número do primeiro.
- Multiplicação: Multiplica dois números fornecidos.
- Divisão: Divide o primeiro número pelo segundo, com verificação de divisão por zero.
- Menu Interativo: Apresenta um menu de opções e permite realizar múltiplas operações até que o usuário escolha sair.

# Como usar
- Execute o programa.
- Escolha uma das opções do menu:
- 1: Somar dois números.
- 2: Subtrair dois números.
- 3: Multiplicar dois números.
- 4: Dividir dois números (o divisor deve ser diferente de zero).
- 5: Encerrar o programa.
- Insira os dois números quando solicitado e veja o resultado da operação.
- O programa continuará retornando ao menu até que você escolha a opção "Sair".

# Requisitos
- Java: Certifique-se de ter o JDK instalado em sua máquina.
- IDE recomendada: Qualquer IDE Java como IntelliJ, Eclipse, ou mesmo o terminal com compilador javac.

# Estrutura do código
- O programa usa um loop do-while para manter o menu interativo em execução até que o usuário selecione a opção de sair.
- O tratamento de exceção é feito para a operação de divisão, prevenindo erros em caso de divisão por zero.
- A entrada do usuário é capturada usando a classe Scanner e os valores são processados com operadores aritméticos básicos.

# Melhorias Futuras
- Implementação de operações avançadas como potência, raiz quadrada, etc.
- Adicionar validação de entrada para números decimais e tratamento de exceções mais robusto.
- Criação de uma interface gráfica (GUI) usando Swing ou JavaFX.

# Como executar
- Clone este repositório: git clone https://github.com/SeuUsuario/calculadora-simples-java.git
- Compile o código: javac Main.java
- Execute o programa: java Main
