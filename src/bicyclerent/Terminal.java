package bicyclerent;

public class Terminal {
    private String address;
    private int bikesParked;

    public Terminal(String address, int bikesParked) {
        this.address = address;
        this.bikesParked = bikesParked;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBikesParked() {
        return bikesParked;
    }

    public void setBikesParked(int bikesParked) {
        this.bikesParked = bikesParked;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "address='" + address + '\'' +
                ", bikesParked=" + bikesParked +
                '}';
    }
}
