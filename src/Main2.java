import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Polymorphism (Person -> Commuter)
        List<Person> people = new ArrayList<>();
        people.add(new Commuter(1, "Ali", 20, "Student"));
        people.add(new Commuter(2, "Dana", 32, "Monthly"));
        people.add(new Commuter(3, "Bekzat", 45, "Single"));

        System.out.println("=== Polymorphism ===");
        for (Person p : people) {
            p.displayInfo();
        }

        // Searching
        System.out.println("\nSearching for commuter named Bekzat:");
        for (Person p : people) {
            if (p.getName().equals("Bekzat")) {
                System.out.println(p);
            }
        }

        // Filtering
        System.out.println("\nCommuters older than 30:");
        people.stream()
                .filter(p -> p.getAge() > 30)
                .forEach(System.out::println);

        // Sorting commuters
        List<Commuter> commuters = new ArrayList<>();
        commuters.add(new Commuter(4, "Arman", 19, "Student"));
        commuters.add(new Commuter(5, "Nurislam", 28, "Monthly"));
        commuters.add(new Commuter(6, "Dana", 35, "Single"));

        Collections.sort(commuters);

        System.out.println("\nSorted commuters by age:");
        commuters.forEach(System.out::println);

        // Working with buses
        TransportService service = new TransportService();
        service.addBus(new Bus("B12", "Center - North", 50));
        service.addBus(new Bus("A7", "East - West", 40));
        service.addBus(new Bus("C3", "Airport - Center", 60));

        Collections.sort(service.getBuses());

        System.out.println("\nSorted buses by capacity:");
        service.getBuses().forEach(System.out::println);
    }
}
