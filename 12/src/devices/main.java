package devices;

import creatures.FarmAnimal;
import creatures.Pet;

import java.net.URL;
import java.util.ArrayList;

public class main {
    public static void  main(String[] args){

        Disel c1 = new Disel("A3", "Audi", "2000", 5000.0, 2018);
        Electric c2 = new Electric("A4", "Audi", "2005", 7000.0, 2012);
        Electric c3 = new Electric("A5", "Golf", "200", 200.0, 2011);

        Human h1 = new Human("Patryk", "Aleksandrowicz", 12, "men", 2000.0);
        Human h2 = new Human("Patryk", "Paprykowicz", 13, "men", 4000.0);

        h1.setCar(c1, 0, h1);
        h1.setCar(c2, 1, h1);
        h2.setCar(c3, 0, h2);

        h1.setCash(30000.0);
        h2.setCash(50000.0);

        c3.sell(h1,h2,200.0, c3); // bo ma go h2 a nie h1

        c3.sell(h1,h2,200.0, c1);

        System.out.println(c1.czyBylWlascicielem(h1));
        System.out.println(c1.czyAsprzedalB(h1, h2));
        System.out.println(c1.iloscTransakcji());
        //System.out.println(h1.getCar(0).getModel()); //null pointer exception

    }
}