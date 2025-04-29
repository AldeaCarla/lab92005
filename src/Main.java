import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = generareLista();
        System.out.println("Lista generată: " + lista);

        calculeazaSuma(lista);
        calculeazaMaxMin(lista);
        filtreazaLista(lista);
        transformaInDouble(lista);
        verificaPrezenta12(lista);
    }

    static List<Integer> generareLista() {
        Random rand = new Random();
        return rand.ints(10, 5, 26)
                .boxed()
                .collect(Collectors.toList());
    }

    static void calculeazaSuma(List<Integer> lista) {
        int suma = lista.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma elementelor: " + suma);
    }

    static void calculeazaMaxMin(List<Integer> lista) {
        int max = lista.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = lista.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println("Maximul: " + max);
        System.out.println("Minimul: " + min);
    }

    static void filtreazaLista(List<Integer> lista) {
        List<Integer> filtrata = lista.stream()
                .filter(x -> x >= 10 && x <= 20)
                .collect(Collectors.toList());
        System.out.println("Elemente în [10..20]: " + filtrata);
    }

    static void transformaInDouble(List<Integer> lista) {
        List<Double> listaDouble = lista.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Lista ca Double: " + listaDouble);
    }

    static void verificaPrezenta12(List<Integer> lista) {
        boolean contine12 = lista.contains(12);
        System.out.println("Lista conține 12? " + contine12);
    }
}
