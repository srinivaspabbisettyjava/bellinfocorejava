package practise.session9.arrays;

import java.util.Scanner;

public class Array {
static int i;
	public static void main(String[] args) {
		//int[] a=new int[2];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of hotels");
		int size=scan.nextInt();
		Hotels h1[]=new Hotels[size];
		for(i=0;i<=size-1;i++){
			Hotels H1=new Hotels();
			System.out.println("enter hotel name");
			H1.setHotelname(scan.next());
			System.out.println("enter number of rooms");
			H1.setRooms(scan.nextInt());
			System.out.println("enter the rating of the hotel");
			H1.setRating(scan.nextDouble());
			System.out.println("Enter the cost of the room per day");
			H1.setCostperday(scan.nextFloat());
			h1[i]=H1;
		}
		System.out.println("****Hotels list****");
		Hotels H=new Hotels();
		System.out.println("Hotel name   Rooms    Rating    Cost");
		for(i=0;i<=size-1;i++)
		{	
		H = h1[i];
		System.out.println(H.getHotelname()+"     \t"+   H.getRooms()+" 	"+   H.getRating()+" 	"+H.getCostperday());
		}
	}

}
class Hotels{

  String hotelname;
  int rooms;
  double rating;
  float costperday;
  public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public float getCostperday() {
	return costperday;
}
public void setCostperday(float costperday) {
	this.costperday = costperday;
}

  
}