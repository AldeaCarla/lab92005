import java.util.*;
import java.util.stream.*;

public class PatrateDistincte {
    public static void main(String[] args) {
        List<Integer> listaInitiala = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> listaPatrate = listaInitiala.stream()
                .distinct()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("Lista inițială: " + listaInitiala);
        System.out.println("Lista cu pătrate distincte: " + listaPatrate);
    }
}
