
public class Sedan extends Automobile
{

	protected SedanTypes type;
	protected int numCylinders;
	protected double horsepower;

	protected Sedan(String manufacturer, int numWheels, double mpg, int numSeats, String model, SedanTypes type, int numCylinders, double horsepower)
	
	{
		super(manufacturer, numWheels, mpg, numSeats, model);
		
		
		this.type = type;
		this.numCylinders = numCylinders;
		this.horsepower = horsepower;
		
		
		numVehicles++;
	}
	
	//get

	public String getClassName() 
	{
		return "Sedan";
	}

	public SedanTypes getType() 
	{
		return type;
	}



	protected int getNumCylinders() 
	{
		return numCylinders;
	}

	protected void setNumCylinders(int numCylinders) 
	{
		this.numCylinders = numCylinders;
	}

	protected double getHorsepower() 
	{
		return horsepower;
	}
//set
	protected void setHorsepower(double horsepower) 
	{
		this.horsepower = horsepower;
	}
	
	protected void setType(SedanTypes type) 
	{
		this.type = type;
	}

	//2
	public String toString() 
	{
		return "Sedan[manufacturer="+manufacturer+",numWheels="+numWheels+",mpg="+ mpg +",numSeats=" + numSeats +",model="+model+",type="+type +",numCylinders="+ numCylinders+",horsepower="+horsepower + "]";
	}

}

