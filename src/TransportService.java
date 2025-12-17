class TransportService {
    private String city;

    public TransportService(String city) {
        this.city = city;
    }

    public void serve(Commuter c) {
        if (c.hasTicket())
            System.out.println("Passenger allowed");
        else
            System.out.println("No ticket");
    }
}