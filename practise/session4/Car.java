package practise.session4;

public class Car {


		int gear;
		String carName;
		int seats;
		
		public void typeGear(int value){
			gear=value;
		}
		public void carTitle(String name){
			carName=name;
			
		}
		public void numberOfSeats(int value){
		seats=value;
	}
		void printCarDetails(){
			System.out.println("car details :: carname " + carName + " numberofseats ::" + seats + " typegear ::" + gear);
		}
	
}
