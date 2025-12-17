class Commuter {
    private String name;
    private boolean hasTicket;

    public Commuter(String name, boolean hasTicket) {
        this.name = name;
        this.hasTicket = hasTicket;
    }

    public boolean hasTicket() {
        return hasTicket;
    }

    public String toString() {
        return "Commuter: " + name + ", ticket=" + hasTicket;
    }
}