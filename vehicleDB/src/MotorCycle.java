
public class MotorCycle extends TwoWheeler
{

	protected int horsepower;
	protected double mpg;

	public MotorCycle(String manufacturer, int numWheels, String model, int weight, int horsepower, double mpg) 
	{
		super(manufacturer, numWheels, model, weight);
		
		
		this.horsepower = horsepower;
		this.mpg = mpg;
		numVehicles++;
	}

	protected String getClassName() 
	{
		return "MotorCycle";
	}
	
	public int getHorsepower() 
	{
		return horsepower;
	}



	public double getMpg() 
	{
		return mpg;
	}

	public void setMpg(double mpg) 
	{
		this.mpg = mpg;
	}
	
	public void setHorsepower(int horsepower) 
	{
		this.horsepower = horsepower;
	}
	
	
	public String toString() 
	{
		return "MotorCycle [manufacturer=" + manufacturer + ", numWheels=" + numWheels + ", model=" + model + ", weight=" + weight +" lbs" + ", horsepower=" + horsepower + ", mpg=" + mpg + "]";
	}
}
