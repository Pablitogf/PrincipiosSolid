package co.edu.uniquindio.principiosSolid.model.l;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(new Hamster());
        listaAnimales.add(new Gato());
        listaAnimales.add(new Perro());
        listaAnimales.add(new Loro());
        imprimirEsperanzaVida(listaAnimales);
    }

    public static void imprimirEsperanzaVida(ArrayList<Animal> listaAnimales){
        for (Animal animal : listaAnimales){
            System.out.println(animal.esperanzaVida());
        }
    }
}
