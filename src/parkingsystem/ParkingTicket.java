package parkingsystem;

public class ParkingTicket {
    private int hours;
    private ParkingMachine parkingMachine;


    protected ParkingTicket(int hours, ParkingMachine parkingMachine) {
        this.hours = hours;
        this.parkingMachine = parkingMachine;
    }

    public void setParkingMachine(ParkingMachine parkingMachine) {
        this.parkingMachine = parkingMachine;
    }

    public parkingsystem.ParkingMachine getParkingMachine() {
        return parkingMachine;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "hours=" + hours +
                ", parkingMachine=" + parkingMachine +
                '}';
    }
}



