
public class Bicycle extends TwoWheeler

{
	protected int caloriesBurnedPerHour;
	protected boolean hasGears;
	protected boolean hasSuspensions;

	public Bicycle(String manufacturer, int numWheels, String model, int weight,int caloriesBurnedPerHour, boolean hasGears, boolean hasSuspensions) 
	{
		super(manufacturer, numWheels, model, weight);
		
		
		this.caloriesBurnedPerHour = caloriesBurnedPerHour;
		this.hasGears = hasGears;
		this.hasSuspensions = hasSuspensions;
		numVehicles++;
	}

	protected String getClassName() 
	{
		return "Bicycle";
	}

	protected int getCaloriesBurnedPerHour() 
	{
		return caloriesBurnedPerHour;
	}


	protected boolean isHasGears() 
	{
		return hasGears;
	}

	protected boolean isHasSuspensions() 
	{
		return hasSuspensions;
	}

	protected void setHasSuspensions(boolean hasSuspensions) 
	{
		this.hasSuspensions = hasSuspensions;
	}
	
	protected void setHasGears(boolean hasGears) 
	{
		this.hasGears = hasGears;
	}
	
	protected void setCaloriesBurnedPerHour(int caloriesBurnedPerHour) 
	{
		this.caloriesBurnedPerHour = caloriesBurnedPerHour;
	}

	
	public String toString() 
	{
		return "Bicycle [manufacturer=" + manufacturer + ", numWheels=" + numWheels + ", model=" + model + ", weight=" + weight + ", caloriesBurnedPerHour=" + caloriesBurnedPerHour + ", hasGears=" + hasGears + ", hasSuspensions=" + hasSuspensions + "]";
	}
	
}
