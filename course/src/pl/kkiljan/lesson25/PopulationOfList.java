package pl.kkiljan.lesson25;

import pl.kkiljan.lesson20.GetStringFromUser;

import java.util.LinkedList;
import java.util.List;

public class PopulationOfList {

    public static List<String> populationOfList() {

        List <String> list = new LinkedList<>();
        String out;
        while (true) {

            out = GetStringFromUser.getStringFromUser("Podaj linijkę tekstu, \"-\" kończy wprowadzanie.");
            if (out.equals("-")) {
                break;
            }
            list.add(out);

        }
        return list;
    }
}
