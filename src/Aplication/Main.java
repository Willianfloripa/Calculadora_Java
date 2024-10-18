package Aplication;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

   
        int digito = 0;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            digito = sc.nextInt();  // Captura a escolha do usuário

            switch (digito) {
                case 1:
                    System.out.println("Digite dois valores para somar: ");
                    System.out.print("Primeiro valor: " );
                    int valor1 = sc.nextInt();
                    System.out.print("Segundo valor: ");
                    int valor2 = sc.nextInt();
                    int resultadoSoma = valor1+valor2;
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 2:
                    System.out.println("Digite dois valores para subtrair: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextInt();
                    System.out.print("Segundo valor: ");
                    valor2 = sc.nextInt();
                    int resultadoSubtracao = valor1-valor2;
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    System.out.println("Digite dois valores para multiplicar: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextInt();
                    System.out.print("Segundo valor: ");
                    valor2 = sc.nextInt();
                    int resultadoMultiplicacao =valor1*valor2;
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                    break;
                case 4:
                    System.out.println("Digite dois valores para dividir: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextInt();
                    System.out.print("Segundo valor: ");
                    valor2 = sc.nextInt();
                    if (valor2 != 0) {  // Verifica divisão por zero
                        double resultadoDivisao = valor1/valor2;
                        System.out.println("Resultado da divisão: " + resultadoDivisao);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (digito != 5);  // Continua até que a opção seja 5 (Sair)

        sc.close();  // Fecha o scanner
    }
}
