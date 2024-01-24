package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1;
        Double num2;
        String operacao;
        boolean continuar;

        do{
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextDouble();

            System.out.println("Informe a operação EX: (+), (-), (*), (/) ");
            operacao = scanner.next();

            System.out.println("Digite outro valor: ");
            num2 = scanner.nextDouble();

            System.out.println("Resposta: " + realizarCalculo(num1, num2, operacao));

            continuar = verificarNovaOperacao();

        } while (continuar);
    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? ( S / N ) ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

    }

    public static Double realizarCalculo(Double num1, Double num2, String operacao){
        Double resposta = 0.0;

        switch (operacao){
            case "+":
                resposta = num1 + num2;
                break;

            case "-":
                resposta = num1 - num2;
                break;

            case "*":
                resposta = num1 * num2;
                break;

            case "/":
                resposta = num1 / num2;
                break;

            default:
                System.out.println("Operação Inválida :(");
        }

        return resposta;
    }

}