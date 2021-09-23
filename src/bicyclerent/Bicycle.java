package bicyclerent;

public class Bicycle {
    private String brand;
    private int maxGear;
    private int gear;

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

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", maxGear=" + maxGear +
                ", gear=" + gear +
                '}';
    }
}
