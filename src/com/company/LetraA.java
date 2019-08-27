package com.company;

import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        String nome;
        int idade;
           System.out.println("Informe o seu nome: ");
           Scanner sc = new Scanner(System.in);
                   nome = sc.nextLine();
            System.out.println("Informe a sua idade: ");
                   idade = sc.nextInt();
           System.out.println("O seu nome é " + nome + " e sua idade é " + idade + " anos");


    }
}
