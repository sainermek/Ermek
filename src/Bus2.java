import java.util.Objects;

public class Bus implements Comparable<Bus> {
    private String busNumber;
    private String route;
    private int capacity;

    public Bus(String busNumber, String route, int capacity) {
        this.busNumber = busNumber;
        this.route = route;
        this.capacity = capacity;
    }

    public String getBusNumber() { return busNumber; }
    public int getCapacity() { return capacity; }

    @Override
    public int compareTo(Bus other) {
        return Integer.compare(this.capacity, other.capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(busNumber, bus.busNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busNumber);
    }

    @Override
    public String toString() {
        return "Bus [Number=" + busNumber +
                ", Route=" + route +
                ", Capacity=" + capacity + "]";
    }
}
