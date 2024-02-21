package cohortshafta2.entity;

public abstract class HouseType {

    private double price;
    private double squareMeter;

    private int numberOfRooms;

    private int numberOfLivingRoom;

    public HouseType(double price, double squareMeter, int numberOfRooms, int numberOfLivingRoom) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRoom = numberOfLivingRoom;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRoom() {
        return numberOfLivingRoom;
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRoom=" + numberOfLivingRoom +
                '}';
    }

    public int getLivingRoomCount() {
        int livingRoomCount = 0;
        return livingRoomCount;
    }

    public int getSaloonCount() {
        int saloonCount=0;
        return saloonCount;
    }
}
