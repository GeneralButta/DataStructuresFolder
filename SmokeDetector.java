//Aldayne Henry, Id:170426//
public class SmokeDetector {
	
private Room rooms[]= new Room[3];
private float threshold;
private int count=0;
private int MAX= rooms.length;


public SmokeDetector()
{
	this.threshold=0;
}


public SmokeDetector(float threshold)
{
	super();
	this.threshold = threshold;
}



public float getThreshold() {
	return threshold;
}


public void setThreshold(float threshold) {
	this.threshold = threshold;
}

public int getRoomCount()
{
	return count;
}

public Room[] getRooms()
{
	return rooms;
}

public boolean addRoomToBeMonitored(Room room)
{
		if (getRoomCount()<MAX)
		{
			rooms[count]=room;
			count++;
			return true;
		}
		else
			System.out.println("The system can only monitor only a maximum of"+ MAX + " rooms");
			return false;
}

public boolean checkAlarm(float smokeLevel)
{
	
	if (smokeLevel>threshold)
	{
		System.out.println("# of room affected:" + getRoomCount());
		for(int j=0;j < getRoomCount();j++)
		{
			System.out.println(rooms[j].Display());
		}
	
		return true;
	}
	else
	{
		return false;
		
	}

}




}
