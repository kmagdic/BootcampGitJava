package parkingsystem;

public class ParkingSystem {
    public static void main(String[] args) {
        ParkingMachine pm1 = new ParkingMachine("Vukovarska 42", 500, 1000, 3);
        ParkingMachine pm2 = new ParkingMachine("Maksimirska 132", 500, 1000, 3);

        System.out.println(pm1);
        System.out.println(pm2);

    }



}
