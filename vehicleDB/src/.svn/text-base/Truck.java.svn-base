
public class Truck extends Automobile
{

	
	protected int numAxles;
	protected int grossVehicleMass;
	protected TruckTypes type;

	public Truck(String manufacturer, int numWheels, double mpg, int numSeats, String model, int numAxles, int grossVehicleMass, TruckTypes type) 
	{
		
		
		super(manufacturer, numWheels, mpg, numSeats, model);
		
		
		this.numAxles = numAxles;
		this.grossVehicleMass = grossVehicleMass;
		this.type = type;
		numVehicles++;
	}
	//get
	
	public TruckTypes getType() 
	{
		return type;
	}

	public String getClassName() 
	{
		return "Truck";
	}
	
	public int getNumAxles() 
	{
		return numAxles;
	}

	public int getGrossVehicleMass() 
	{
		return grossVehicleMass;
	}
/////set
	public void setType(TruckTypes type) 
	{
		this.type = type;
	}
	
	public void setGrossVehicleMass(int grossVehicleMass) 
	{
		this.grossVehicleMass = grossVehicleMass;
	}
	
	public void setNumAxles(int numAxles) 
	{
		this.numAxles = numAxles;
	}

	
	public String toString() 
	{
		return "Truck [manufacturer=" + manufacturer + ", numWheels=" + numWheels + ", mpg=" + mpg + ", numSeats=" + numSeats + ", model=" + model + ", numAxles=" + numAxles + ", grossVehicleMass=" + grossVehicleMass + ", type=" + type + "]";
	}	
}
