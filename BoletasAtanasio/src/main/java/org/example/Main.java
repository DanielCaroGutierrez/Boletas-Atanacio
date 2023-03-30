package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GrupoUno grupouno = new GrupoUno();
        GrupoDos grupodos = new GrupoDos();
        GrupoTres grupotres = new GrupoTres();
        GrupoCuatro grupocuatro = new GrupoCuatro();
        Scanner sc = new Scanner(System.in);
        int CompraBoleta;

        System.out.println("Donde quiere comprar las boletas \n 1: Popular \n 2: Oriental \n 3: Occidental");
        CompraBoleta = sc.nextInt();

        if (CompraBoleta == 1){

            grupouno.comprar();

        } else if (CompraBoleta == 2) {

            grupodos.comprar();

        }
    }
}