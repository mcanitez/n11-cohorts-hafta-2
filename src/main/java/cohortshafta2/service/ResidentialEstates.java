package cohortshafta2.service;

import cohortshafta2.entity.House;
import cohortshafta2.entity.SummerHouse;
import cohortshafta2.entity.Villa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentialEstates {

    public static List<House> getHouseList = new ArrayList<>();
    public static List<SummerHouse> getSummerHouseList = new ArrayList<>();
    public static List<Villa> getVillaList = new ArrayList<>();

    public static double getHousePrice(){
        double housePrice=0;
        for (House house : getHouseList ){
            housePrice = housePrice+house.getPrice();
        }
        return housePrice;

    }

    public static double getSummerHousePrice(){
        double summerHousePrice=0;
        for (SummerHouse summerHouse : getSummerHouseList){
            summerHousePrice = summerHousePrice+summerHouse.getPrice();
        }
        return summerHousePrice;
    }

    public static double getVillaPrice(){
        double villaPrice=0;
        for (Villa villa : getVillaList){
            villaPrice = villaPrice+villa.getPrice();
        }
        return villaPrice;
    }

    public static double getTotalResidentialEstatePrice(){
        return getHousePrice() + getVillaPrice() + getSummerHousePrice();
    }

    public static double getAvarageHouseSquareMeter(){
        double houseSquareMeter = 0;
        for(House house : getHouseList){
            houseSquareMeter = houseSquareMeter + house.getSquareMeter();
        }
        return houseSquareMeter / getHouseList.size();
    }

    public static double getAvarageSummerHouseSquareMeter(){
        double summerHouseSquareMeter = 0;
        for (SummerHouse summerHouse : getSummerHouseList){
            summerHouseSquareMeter= summerHouseSquareMeter + summerHouse.getSquareMeter();
        }

        return summerHouseSquareMeter / getSummerHouseList.size();
    }

    public static double getAvarageVillaSquareMeter(){
        double villaSquareMeter = 0;
        for(Villa villa : getVillaList){
            villaSquareMeter = villaSquareMeter + villa.getSquareMeter();
        }
        return villaSquareMeter / getHouseList.size();
    }

    public static double getAvarageResidentialEstateSquareMeter(){
        return (getAvarageHouseSquareMeter()+getAvarageVillaSquareMeter()+getAvarageSummerHouseSquareMeter() / (getHouseList.size() + getVillaList.size() + getSummerHouseList.size()));
    }



    public static List<House> filterHousesByRoomAndSaloon(int roomCount, int saloonCount) {
        List<House> filteredHouses = new ArrayList<>();

        for (House house : getHouseList) {
            if (house.getLivingRoomCount() == roomCount && house.getSaloonCount() == saloonCount) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses;
    }

    public static List<SummerHouse> filterSummerHousesByRoomAndSaloon(int roomCount, int saloonCount) {
        List<SummerHouse> filteredSummerHouses = new ArrayList<>();

        for (SummerHouse summerHouse : getSummerHouseList) {
            if (summerHouse.getLivingRoomCount() == roomCount && summerHouse.getSaloonCount() == saloonCount) {
                filteredSummerHouses.add(summerHouse);
            }
        }

        return filteredSummerHouses;
    }

    public static List<Villa> filterVillaByRoomAndSaloon(int roomCount, int saloonCount) {
        List<Villa> filteredVilla = new ArrayList<>();

        for (Villa villa : getVillaList) {
            if (villa.getLivingRoomCount() == roomCount && villa.getSaloonCount() == saloonCount) {
                filteredVilla.add(villa);
            }
        }

        return filteredVilla;
    }

}




























