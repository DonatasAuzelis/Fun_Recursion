import java.util.*;

public class Database {

    public static List<Worker> getWorkersList() {

        List<Worker> hierarchy = new LinkedList<>();

        hierarchy.add(new Worker("Tomten", Arrays.asList("Glader", "Butter")));
        hierarchy.add(new Worker("Glader", Arrays.asList("Tröger", "Trötter", "Blyger")));
        hierarchy.add(new Worker("Butter", Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven")));
        hierarchy.add(new Worker("Trötter", Arrays.asList("Skumtomten")));
        hierarchy.add(new Worker("Skumtomten", Arrays.asList("Dammråttan")));
        hierarchy.add(new Worker("Räven", Arrays.asList("Gråsuggan", "Myran")));
        hierarchy.add(new Worker("Myran", Arrays.asList("Bladlusen")));

        return hierarchy;
    }

}
