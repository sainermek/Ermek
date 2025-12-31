import java.util.ArrayList;
import java.util.List;

public class TransportService {
    private List<Bus> buses = new ArrayList<>();

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }
}
