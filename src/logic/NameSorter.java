package logic;

import java.util.ArrayList;
import java.util.Collections;

public class NameSorter {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Giulio");
        names.add("Anastasia");
        names.add("Matteo");
        names.add("Alessandro");
        names.add("Sara");
        names.add("Gabriele");

        Collections.sort(names);

    }
}
