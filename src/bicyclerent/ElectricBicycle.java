package bicyclerent;

public class ElectricBicycle extends Bicycle {

    private int batteryCapacity = 0;


    public ElectricBicycle(String brand, int maxGear, int gear, int batteryCapacity) {
        super(brand, maxGear, gear);
        this.batteryCapacity = batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricBicycle{" +
                "batteryCapacity=" + batteryCapacity +
                '}' + " based on " + super.toString();
    }
}
