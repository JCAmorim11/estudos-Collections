package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class ExemploList {
    public static void main(String[] args){

        //Metodos de inicializar uma Lista
       // List notas = new ArrayList<>(); METODO pré java 5
        //List<Double> notas = new ArrayList<>(); //Generics e Diamond Operator
//        ArrayList<Double> notas = new ArrayList<>();
       // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.6,5.5,3d,10d,5d,3.6));
      // List<Double> notas = Arrays.asList(6d,10d,5.5,7.8,9.9,4.5,3d,5d,9d); //Lista imutavel

//        List<Double> notas = List.of(5d,6.6,5.2,3d,1d,10d,6.7,4.8);
//        notas.add(10d);
//        notas.remove(5d);
//        System.out.println(notas);

        System.out.println("Crie uma lista de adicione notas");

        List<Double> notas = new ArrayList<>(); //Generics e Diamond Operator
        notas.add(7d);

        notas.add(5d);
        notas.add(10d);
        notas.add(2.1);
        notas.add(9.2);
        notas.add(5.5);
        notas.add(4.9);
        notas.add(2.8);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exibindo a posição da nota 5: "+notas.indexOf(5d));

        System.out.println("Adicionando na lista a nota 8.0 na posição 4:\n");
        notas.add(4,8d);

        System.out.println(notas);


        System.out.println("Substituindo a nota 5 pela nota 6 \n");
        notas.set(notas.indexOf(5d), 6.0);

        System.out.println(notas);


        System.out.println("Conferindo se a nota 5 está na lista: \n"+ notas.contains(5d)+"\n");

        System.out.println("Exibindo as notas na ordem que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);


    }
}
