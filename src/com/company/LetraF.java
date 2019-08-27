package com.company;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double preco;
        double total;
                System.out.println("Informe a quantidade de produto:");
        quantidade = sc.nextInt();
        System.out.println("Informe o preço do produto:");
        preco = sc.nextDouble();
                total = quantidade * preco;
                System.out.println("O total a ser pago é R$" + total);
    }
}
