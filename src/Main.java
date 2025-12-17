public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus(10, 40);
        Bus b2 = new Bus(12, 40);

        Commuter c = new Commuter("Alex", true);
        TransportService t = new TransportService("Astana");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c);

        System.out.println(b1.getCapacity() == b2.getCapacity());
        t.serve(c);
    }
}