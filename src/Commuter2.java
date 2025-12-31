public class Commuter extends Person implements Comparable<Commuter> {
    private int commuterId;
    private String ticketType;

    public Commuter(int commuterId, String name, int age, String ticketType) {
        super(name, age);
        this.commuterId = commuterId;
        this.ticketType = ticketType;
    }

    public int getCommuterId() { return commuterId; }
    public String getTicketType() { return ticketType; }

    @Override
    public int compareTo(Commuter other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Commuter [ID=" + commuterId +
                ", Name=" + name +
                ", Age=" + age +
                ", TicketType=" + ticketType + "]";
    }
}
