package cohortshafta2;

import cohortshafta2.entity.House;
import cohortshafta2.entity.SummerHouse;
import cohortshafta2.entity.Villa;
import cohortshafta2.service.ResidentialEstates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

@SpringBootApplication
public class CohortsHafta2Application {


	public static void main(String[] args) {
		SpringApplication.run(CohortsHafta2Application.class, args);

		List<House> getHouseList = ResidentialEstates.getHouseList;
		List<SummerHouse> getSummerHouseList = ResidentialEstates.getSummerHouseList;
		List<Villa> getVillaList = ResidentialEstates.getVillaList;


		House house = new House(500000,120,4,1);
		House house2 = new House(1000000,150,5,1);
		House house3 = new House(200000,75,2,1);

		SummerHouse summerHouse = new SummerHouse(1250000,135,4,1);
		SummerHouse summerHouse2 = new SummerHouse(3000000,170,6,2);
		SummerHouse summerHouse3 = new SummerHouse(5000000,200,7,3);


		Villa villa = new Villa(850000,145,5,1);
		Villa villa2 = new Villa(1000000,130,3,1);
		Villa villa3 = new Villa(850000,100,3,1);



		getHouseList.add(house);
		getHouseList.add(house2);
		getHouseList.add(house3);

		getSummerHouseList.add(summerHouse);
		getSummerHouseList.add(summerHouse2);
		getSummerHouseList.add(summerHouse3);

		getVillaList.add(villa);
		getVillaList.add(villa2);
		getVillaList.add(villa3);

		System.out.println("*********************** FEATURES OF THE RESIDENCES **************************************");

		System.out.println("Total House Price: " + ResidentialEstates.getHousePrice());
		System.out.println("Total Villa Price: " + ResidentialEstates.getVillaPrice());
		System.out.println("Total Summer House Price: " + ResidentialEstates.getSummerHousePrice());
		System.out.println("Total Residential Estate Price: " + ResidentialEstates.getTotalResidentialEstatePrice());
		System.out.println("**********************************************************************************");

		System.out.println("Average House Square Meter: " + ResidentialEstates.getAvarageHouseSquareMeter());
		System.out.println("Average Villa Square Meter: " + ResidentialEstates.getAvarageVillaSquareMeter());
		System.out.println("Average Summer House Square Meter: " + ResidentialEstates.getAvarageSummerHouseSquareMeter());
		System.out.println("Average Residential Estate Square Meter: " + ResidentialEstates.getAvarageResidentialEstateSquareMeter());
		System.out.println("**********************************************************************************");

		System.out.println("Filtered House List by living room count and saloon count: " + ResidentialEstates.filterHousesByRoomAndSaloon(4, 1));
		System.out.println("Filtered Villa List by living room count and saloon count: " + ResidentialEstates.filterSummerHousesByRoomAndSaloon(6, 2));
		System.out.println("Filtered Summer House List by living room count and saloon count: " + ResidentialEstates.filterVillaByRoomAndSaloon(3, 1));

	}
}
