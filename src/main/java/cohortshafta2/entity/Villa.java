package cohortshafta2.entity;

public class Villa extends HouseType{
    public Villa(double price, double squareMeter, int numberOfRooms, int numberOfLivingRoom) {
        super(price, squareMeter, numberOfRooms, numberOfLivingRoom);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
