package practise.session4;

public class Cardemo {
	public static void main(String[] args){
		Car audiCar=new Car();
		audiCar.typeGear(6);
		audiCar.carTitle("Audi");
		audiCar.numberOfSeats(5);
		
		Car BMW=new Car();
		
		BMW.typeGear(6);
		BMW.carTitle("BMW");
		BMW.numberOfSeats(4);
		
		audiCar.printCarDetails();
		BMW.printCarDetails();
		
		
	}
	
	

}
