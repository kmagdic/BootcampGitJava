package parkingsystem;

public class ParkingMachine {
    private String address;
    private int money;
    private int emptyTicketsPaper;
    private int ticketPricePerHour = 3;


    public ParkingMachine(String adress, int money, int emptyTicketsPaper, int ticketPricePerHour) {
        this.address = adress;
        this.money= money;
        this.emptyTicketsPaper = emptyTicketsPaper;
        this.ticketPricePerHour = ticketPricePerHour;
    }


    public void setEmptyTicketsPaper(int emptyTicketsPaper) {
        this.emptyTicketsPaper = emptyTicketsPaper;
    }

    public int getEmptyTicketsPaper() {
        return emptyTicketsPaper;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTicketPricePerHour() {
        return ticketPricePerHour;
    }

    public void setTicketPricePerHour(int ticketPricePerHour) {
        this.ticketPricePerHour = ticketPricePerHour;
    }

    public int makeTicket(int hours) {
        return hours;
    }



    @Override
    public String toString() {
        return "ParkingMachine{" +
                "address='" + address + '\'' +
                ", money=" + money +
                ", emptyTicketsPaper=" + emptyTicketsPaper +
                ", ticketPricePerHour=" + ticketPricePerHour +
                '}';
    }
}
