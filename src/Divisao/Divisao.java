package Divisao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva dois números que mostrarei a divisão entre eles.");
        int numero1 = scanner.nextInt();
        System.out.println("Dividido por: ");
        int numero2 = scanner.nextInt();
        try {
            int divisao = numero1 / numero2;
            System.out.println("Resulta em : " + divisao);
        } catch (ArithmeticException e){
            System.out.println("Divisao.Divisao por 0 não permitida");
        }

    }
}
