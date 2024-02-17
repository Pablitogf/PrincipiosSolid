package co.edu.uniquindio.principiosSolid.model.o;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AnimalAdopciones> listaAnimalAdopciones = new ArrayList<>();
        listaAnimalAdopciones.add(new HamsterAdopciones());
        listaAnimalAdopciones.add(new PerroAdopciones());
        listaAnimalAdopciones.add(new GatoAdopciones());
        imprimirListaAnimal(listaAnimalAdopciones);
    }

    public static void imprimirListaAnimal(ArrayList<AnimalAdopciones> listaAnimalAdopciones){
        for (AnimalAdopciones animalAdopciones : listaAnimalAdopciones){
            System.out.println(animalAdopciones.precioAnimal());
        }
    }
}
