package org.example.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;import java.util.List;

public class ordenandoListas {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList(){{
           add(new Gato("duke", 4, "laranja"));
            add(new Gato("black", 3, "frajola"));
            add(new Gato("atena", 2, "rajado"));
        }};


        System.out.println("#####  Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("#### Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


        System.out.println("#### Ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);


        System.out.println("#### Ordem idade");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos+"\n");


        System.out.println("#### Ordem cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos+"\n");

        System.out.println("#### Ordem Nome/Cor/idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos+"\n");
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

@Override public int compare(Gato o1, Gato o2) {
    return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
 class ComparatorCor implements Comparator<Gato> {
        @Override public int compare(Gato o1, Gato o2) {
            return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

@Override public int compare(Gato o1, Gato o2) {
    int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
    if(nome != 0) return nome;

    int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
    if(cor !=0) return cor;


    return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}



