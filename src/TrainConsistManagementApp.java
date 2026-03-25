import java.util.LinkedHashSet;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate bogie
        train.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}