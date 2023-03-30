package org.example;

import java.util.Scanner;

public class GrupoCuatro extends Entradas{

    Scanner sc = new Scanner(System.in);

    @Override
    public void comprar() {

        int boletasCompradas;
        int valorBoleta = 40000;
        int valorTotal;

        System.out.println("Boletas a comprar");
        boletasCompradas = sc.nextInt();

        valorTotal = boletasCompradas * valorBoleta;

        System.out.println("El valor total de la compra es: "+ valorTotal);

    }
}
