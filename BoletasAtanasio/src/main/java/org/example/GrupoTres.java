package org.example;

import java.util.Scanner;

public class GrupoTres extends Entradas{

    Scanner sc = new Scanner (System.in);

    @Override
    public void comprar() {

            double valorNeto;
            int boletasCompradas;
            double valorBoleta = 150000;
            double valorTotal;
            int opcionDia;
            double descuento;
            int limiteCompra = 0;

            while (limiteCompra == 0) {
                System.out.println("Digite el dia de la compra:\n 1: martes \n 2: Miercoles \n 3: Jueves \n 4: Viernes");
                opcionDia = sc .nextInt();

                switch (opcionDia) {

                    case 1:


                        System.out.println("Boletas a comprar");
                        boletasCompradas = sc.nextInt();

                        if (boletasCompradas <= 1) {
                            valorNeto = (valorBoleta * 0.15);
                            valorTotal = boletasCompradas * valorNeto;

                            descuento = valorTotal * 0.05;

                            valorTotal = valorTotal - descuento;

                            System.out.println("El valor total de la compra es: " + valorTotal);

                            limiteCompra = 2;
                        } else
                            System.out.println("Solo puedes comprar 1 boleta");
                        break;

                    case 2:

                        System.out.println("Boletas a comprar");
                        boletasCompradas = sc.nextInt();

                        if (boletasCompradas <= 1) {

                            valorNeto = (valorBoleta * 0.15);
                            valorTotal = boletasCompradas * valorNeto;

                            descuento = valorTotal * 0.02;

                            valorTotal = valorTotal - descuento;

                            System.out.println("El valor total de la compra es: " + valorTotal);

                            limiteCompra = 2;
                        } else
                            System.out.println("Solo puedes comprar 1 boleta");

                        break;

                    case 3:


                        System.out.println("Boletas a comprar");
                        boletasCompradas = sc.nextInt();

                        if (boletasCompradas <= 2) {

                            valorNeto = (valorBoleta * 0.15);
                            valorTotal = boletasCompradas * valorNeto;

                            descuento = valorTotal * 0.015;

                            valorTotal = valorTotal - descuento;

                            System.out.println("El valor total de la compra es: " + valorTotal);

                            limiteCompra = 2;
                        } else
                            System.out.println("Solo puedes comprar 1 boleta");
                        break;

                    case 4:


                        System.out.println("Boletas a comprar");
                        boletasCompradas = sc.nextInt();

                        if (boletasCompradas <= 2) {
                            valorNeto = (valorBoleta * 0.15);
                            valorTotal = boletasCompradas * valorNeto;

                            descuento = valorTotal * 0.01;

                            valorTotal = valorTotal - descuento;

                            System.out.println("El valor total de la compra es: " + valorTotal);

                            limiteCompra = 2;
                        } else
                            System.out.println("Solo puedes comprar 1 boleta");

                        break;

                }
            }
        }
}

