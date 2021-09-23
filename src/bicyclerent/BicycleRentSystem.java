package bicyclerent;

public class BicycleRentSystem {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.setBrand("BMX");
        b1.setMaxGear(18);
        b1.setGear(5);
        System.out.println("Bicycle 1: " + b1);

        Bicycle b2 = new Bicycle();
        b2.setBrand("Schwin");
        b2.setMaxGear(18);
        b2.setGear(19);
        System.out.println("Bicycle 2: " + b2);

    }
}
