package parkingsystem;

public class ParkingTicket {
    private int hours;
    private ParkingMachine parkingMachine;


    public ParkingTicket(int hours, ParkingMachine parkingMachine) {
        this.hours = hours;
        this.parkingMachine = parkingMachine;
    }

    public void setParkingMachine(ParkingMachine parkingMachine) {
        this.parkingMachine = parkingMachine;
    }

    public parkingsystem.ParkingMachine getParkingMachine() {
        return parkingMachine;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "hours=" + hours +
                ", parkingMachine=" + parkingMachine +
                '}';
    }
}



