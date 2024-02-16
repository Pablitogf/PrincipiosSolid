package co.edu.uniquindio.principiosSolid.model.o;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Articulo> listaArticulos = new ArrayList<>();
        listaArticulos.add(new Audifonos());
        listaArticulos.add(new Mouse());
        listaArticulos.add(new Teclado());
        imprimirListaArticulos(listaArticulos);
    }

    public static void imprimirListaArticulos(ArrayList<Articulo> listaArticulo){
        for (Articulo articulo : listaArticulo){
            System.out.println(articulo.precioArticulo());
        }
    }
}
