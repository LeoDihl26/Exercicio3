package com.mycompany.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String a;
        int pedido, quantidade;
        double total;
        
        System.out.printf("\nGostaria de ver o nosso menu?");
        
        a = teclado.nextLine();
        
        System.out.printf("\nMENU\n"
                + "1 | Cachorro Quente | R$4,00\n"
                + "2 |    X-Salada     | R$4,50\n"
                + "3 |    X-Bacon      | R$5,00\n"
                + "4 | Torrada Simples | R$2,00\n"
                + "5 | Refrigerante    | R$3,00\n");
        
        System.out.printf("\nQual o seu pedido?");
        
        pedido = teclado.nextInt();
        
        System.out.printf("\nQuantos você vai querer?");
        
        quantidade = teclado.nextInt();
        
        if (pedido == 1) {
            total = quantidade * 4.0;
            System.out.printf("\nO total do seu pedido foi: R$%.2f\n", total);
            System.out.printf("\nObrigado pelo pedido!");
        }
        
        else if (pedido == 2) {
            total = quantidade * 4.5;
            System.out.printf("\nO total do seu pedido foi: R$%.2f\n", total);
            System.out.printf("\nObrigado pelo pedido!");
        }
        
        else if (pedido == 3) {
           total = quantidade * 5.0;
           System.out.printf("\nO total do seu pedido foi: R$%.2f\n" + total);
           System.out.printf("\nObrigado pelo pedido!");
        }
        
        else if (pedido == 4) {
           total = quantidade * 2.0;
           System.out.printf("\nO total do seu pedido foi: R$%.2f\n" + total);
           System.out.printf("\nObrigado pelo pedido!");
        }
        
        else if (pedido == 5) {
           total = quantidade * 3.0;
           System.out.printf("\nO total do seu pedido foi: R$%.2f\n" + total);
           System.out.printf("\nObrigado pelo pedido!");
        }
    }
}
