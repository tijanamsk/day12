package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Oblik o1=new Kvadar("plava",4.5,1.2,3.4);
        Oblik o2=new Sfera("crvena",3.8);
        Oblik o3=new Kvadar("crvena",6.1,2.4,3.1);
        Oblik o4=new Sfera("crna",7.1);
        Oblik o5=new Kvadar("bela",5.1,3.4,4.1);
        Oblik o6=new Sfera("zuta",6.4);
        if(o1.equals(o2)){
            System.out.println(o1.toString()+ " "+o1.zapremina()+" " +o2.toString()+" "+o2.zapremina());
            System.out.println("isti su");
        }else{
            System.out.println("nisu isti");

        }

        if(o1.equals(o1)){
            System.out.println(o1.toString()+ " "+o1.zapremina()+" " +o1.toString()+" "+o1.zapremina());
            System.out.println("isti su");
        }else{
            System.out.println("nisu isti");

        }

	// write your code here
        // napraviti apstraktnu klasu iz nje izvodimo sferu i kvadar
        // sfera pored boje prima i poluprecnik, i povrsina i zapremina
        //kvadar ima 3 parametra povrsina i zapremina
        // obe klase treba da pregaze toString
        //treba da uporedimo da li su dve figure iste ako im je ista boja i ista zapremina

        //sada implementacija compared to po rastucem redosledu po zapremini ko ima vecu zapreminu ide na kraj,
        // u mainu se pravi niz objekata i sortira se pomocu ArraySort
        List<Oblik> lista=new ArrayList<>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);
        lista.add(o6);
        System.out.println("Nesortirana lista");
        for(Oblik o:lista){
            System.out.println(o.toPrint());
        }


        // pravi se jos jedan interface koja ce da implementira Printable
        // ima jednu metodu print sve klase koje implementiraju te klase da stampaju redom
        System.out.println("Sortirana lista");
        Collections.sort(lista);
        for(Oblik o:lista){
            System.out.println(o.toPrint());
        }
    }
}
