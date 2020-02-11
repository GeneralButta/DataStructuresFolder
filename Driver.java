//Aldayne Henry, Id:170426//

public class Driver {

	public static void main(String[] args) {
	
		Room Room_1= new Room();
		Room_1.setName("Lab B");
		Room_1.setCapacity(25);
		
		Room Room_2= new Room("Lab A",45);
		
		SmokeDetector smokes= new SmokeDetector((float)50.0);
		smokes.addRoomToBeMonitored (Room_1);
		smokes.addRoomToBeMonitored(Room_2);
		
		smokes.checkAlarm((float)75.0);
		smokes.checkAlarm((float)33.0);
		
		
}

}