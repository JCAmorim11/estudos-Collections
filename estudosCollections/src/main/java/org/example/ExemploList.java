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
        notas.add(0.0);
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
        for (Double nota : notas) System.out.print(nota+", ");

        System.out.println("\n");
        System.out.println("Exibindo a terceira nota adicionada \n"+ notas.get(2));


        System.out.println("\n");
        System.out.println("Exibindo a menor nota \n"+ Collections.min(notas));

        System.out.println("\n");
        System.out.println("Exibindo a maior nota \n"+ Collections.max(notas));

        System.out.println("\n");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;
        }
        System.out.println("Exibindo a soma das notas: \n"+ soma);


        System.out.println("\n");
        System.out.println("Exibindo media das notas \n"+ (soma/ notas.size()));

        System.out.println("\n");
        notas.remove(0d);
        System.out.println("Removendo nota 0 \n"+ notas );


        System.out.println("\n");
        notas.remove(0);
        System.out.println("Removendo nota na posição 0 \n"+ notas );



        System.out.println("\n");
        System.out.println("remova as notas menores que 7 da lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.print(notas);

        System.out.println("\n");
        System.out.println("Apagando toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n");
        System.out.println("Checando se a lista está vazia: "+ notas.isEmpty());
    }
}
