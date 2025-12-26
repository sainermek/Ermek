class Bus {
    private int number;
    private int capacity;

    public Bus(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "Bus №" + number + ", capacity=" + capacity;
    }
}