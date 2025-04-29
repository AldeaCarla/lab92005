import java.util.*;
import java.util.stream.*;

public class ProcesareText {
    public static void main(String[] args) {
        String text = "Acesta este un program scris cu java 8 si expresii lambda";


        List<String> cuvinte = Arrays.asList(text.split(" "));


        List<String> lungimeMin5 = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungime >= 5: " + lungimeMin5);
        System.out.println("Număr de cuvinte: " + lungimeMin5.size());


        List<String> sortate = lungimeMin5.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista ordonată: " + sortate);


        Optional<String> cuvantCuP = cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst();

        if (cuvantCuP.isPresent()) {
            System.out.println("Un cuvânt care începe cu 'p': " + cuvantCuP.get());
        } else {
            System.out.println("Nu există cuvinte care încep cu 'p'.");
        }
    }
}
