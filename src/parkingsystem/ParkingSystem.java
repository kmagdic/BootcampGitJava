package parkingsystem;

public class ParkingSystem {
    public static void main(String[] args) {
        ParkingMachine pm1 = new ParkingMachine("Vukovarska 42", 500, 1000, 3);
        ParkingMachine pm2 = new ParkingMachine("Maksimirska 132", 500, 1000, 3);

        ParkingTicket pt1 = new ParkingTicket(5, pm1);
        ParkingTicket pt2 = new ParkingTicket(2, pm1);
        ParkingTicket pt3 = new ParkingTicket(1, pm2);
        ParkingTicket pt4 = new ParkingTicket(7, pm2);



        System.out.println(pm1);
        System.out.println(pm2);
        System.out.println(pt1);
        System.out.println(pt2);

    }



}
