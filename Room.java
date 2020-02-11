
public class Room {
		
	private String name= " ";
	private int capacity= 0;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	@Override
	public String toString() {
		return "Room [name=" + name + ", capacity=" + capacity + "]";
	}
	
	public Room(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	public Room() {
		super();
		this.name=" ";
		this.capacity= 0;
		
	}
	
	public Room (Room obj)
	{
		this.name=obj.name;
		this.capacity=obj.capacity;
	}
	
	public String Display()
	{
		return "Name: "+ name + ",capacity:" + capacity;
	}
	
	
	
}
