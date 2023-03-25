package org.example.lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;import static java.util.ArrayList.*;

public class exercicioProposto {
    public static void main(String[] args){
        List<Temperatura> temperaturas = new ArrayList(){{
            add(new Temperatura(1, 32.8));
            add(new Temperatura(2, 30.1));
            add(new Temperatura(3, 28.75));
            add(new Temperatura(4, 25.09));
            add(new Temperatura(5, 22.3));
            add(new Temperatura(6, 15.15));
        }};
        List<String> meses = Arrays.asList("Janeiro", "Fevereiro","Março","Abril","Maio","Junho");
        double soma = 0d;
        for ( Temperatura temp: temperaturas){
            soma += temp.getTempMedia();
        }

        System.out.println("##### media todas as temperaturas");
        System.out.println(String.format("%.3f",(soma/temperaturas.size()))+"\n");
        System.out.println("Os seguintes meses tiveram temperaturas acima da media: ");
        for(Temperatura temp: temperaturas){
            if(temp.getTempMedia() > (soma/temperaturas.size())){
                System.out.println(temp.getMes()+" - "+meses.get(temp.getMes()-1));
            }
        }
    }
}

class Temperatura{
    private int mes;
    private double tempMedia;
    public Temperatura(int mes, double tempMedia) {
        this.mes=mes;
        this.tempMedia=tempMedia;
    }
    public int   getMes() {
      return mes;
    }
    public void setMes(int mes) {
            this.mes = mes;
    }

    public double getTempMedia() {
      return tempMedia;
    }
    public void setTempMedia(int tempMedia) {
            this.tempMedia = tempMedia;
    }
}
