import java.util.*;

public class Main {

    List<Worker> hierarchy = Database.getWorkersList();
    List<String> returnSuperBosses = new LinkedList<>();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        getSuperBosses("Dammråttan", hierarchy).forEach(System.out::println);
    }

    public List<String> getSuperBosses(String searchName, List<Worker> list) {

        String name = list.stream().filter(e -> e.getSubWorkers().contains(searchName)).findAny()
                .map(Worker::getName).map(Object::toString).orElse(null);
        if (name != null) {
            returnSuperBosses.add(name);
            getSuperBosses(name, list);
        }
        return returnSuperBosses;
    }
}
