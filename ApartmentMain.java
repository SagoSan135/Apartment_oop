
import java.util.Scanner;

public class AppartmentMain {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GardenApartment a = new GardenApartment(123, 400,new Date(22, 12, 96), 100, false);
		System.out.println (a.toString());
		
		a.setGardenSurcase(123123);
		System.out.println (a.toString());
		
		Apartment [] arr = new Apartment[4];
		for(int i = 0; i<4 ; i++){
			System.out.println("Wich Apartment do you want?");
			System.out.println("1. for Garden Apartment, 2. for Student Apartment.");
			int choise = input.nextInt();
			
			
			
			switch (choise) {
			case 1: {
				System.out.println("enter Apartment number:\n" );
				int aparmentNum = input.nextInt();
				System.out.println("enter Apartment serface:\n");
				int surface = input.nextInt();
				System.out.println("enter the Garden surcafe:\n");
				int gardenSerface = input.nextInt();
				System.out.println("Do you want a pool in your apartment? \n");
				Boolean hasPool = input.nextBoolean();
				
				//Data
				System.out.println("enter the day of sell:\n" );
				int day = input.nextInt();
				System.out.println("enterthe month of sell:\n");
				int month = input.nextInt();
				System.out.println("enter the year of sell:\n");
				int year = input.nextInt();
				
				Apartment apartment = new GardenApartment(aparmentNum, surface, new Date(day,month,year), gardenSerface, hasPool);
				arr[i] = apartment;
			
						
			}
			case 2: {
				System.out.println("enter Apartment number:\n" );
				int aparmentNum = input.nextInt();
				System.out.println("enter how many levels:\n");
				int lvl = input.nextInt();
				System.out.println("enter the surface:\n");
				int surface = input.nextInt();
				System.out.println("Do number of Terraces: \n");
				int numOfTerraces = input.nextInt();
				
				//Data
				System.out.println("enter the day of sell:\n" );
				int day = input.nextInt();
				System.out.println("enterthe month of sell:\n");
				int month = input.nextInt();
				System.out.println("enter the year of sell:\n");
				int year = input.nextInt();
				
				Apartment apartment2 = new StudentApartment(aparmentNum, lvl, surface,new Date(day,month,year) ,numOfTerraces);
				arr[i] = apartment2;
				
				
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			
				
		}
		input.close();
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].surface>100)
				System.out.println(arr[i].toString());
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] instanceof StudentApartment && ((StudentApartment)arr[i]).getMonth() == 1)
				System.out.println(arr[i].toString());
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr [i] instanceof GardenApartment) {
				((GardenApartment)arr[i]).setGardenSurcase(50);
			}
		}

	}
	
}
