import java.util.List;

public class Worker {

    private String name;
    private List<String> subWorkers;

    public Worker(String name, List<String> subWorkers) {
        this.name = name;
        this.subWorkers = subWorkers;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubWorkers() {
        return subWorkers;
    }

}
