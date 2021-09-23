package bicyclerent;

public class Bicycle {
    private String brand;
    private int maxGear;
    private int gear;
    private boolean available;
    private Terminal terminal;

    public Bicycle(String brand, int maxGear, int gear) {
        this.brand = brand;
        this.maxGear = maxGear;
        this.gear = gear;
    }

    public Bicycle() {

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public void setMaxGear(int maxGear) {
        this.maxGear = maxGear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if(gear < maxGear)
            this.gear = gear;
        else
            this.gear = maxGear;
    }

    public void gearUp() {
        if(gear < maxGear)
            gear++;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", maxGear=" + maxGear +
                ", gear=" + gear +
                ", available=" + available +
                ", terminal=" + terminal +
                '}';
    }
}
