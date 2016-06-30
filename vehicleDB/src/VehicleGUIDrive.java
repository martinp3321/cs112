import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//GUI
//BORDER



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class VehicleGUIDrive {
	public static void main(String[] args) 
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// I/O
	
	//Contruct
	
	//Exception nullpoint
	//array set

	//System.out.println("\n");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	{
		int count = 0;
		File inputFile = new File(args[0]);
		Scanner LineScan = null, WordScan;
		Vehicle[] DBV = null;


		try 
		
		
		{
		LineScan = new Scanner(inputFile);
		} 
		
		catch (FileNotFoundException e) 
		//Exceptions
		
		{
		System.out.println("Not found " + e);
		}
		
		//continue
		
		if (LineScan.hasNext())
		
		
		{
		int size = LineScan.nextInt();
		DBV = new Vehicle[size];
		}
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//It
		//Read
		//Data 
		//Parse
		


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		while (LineScan.hasNext()) 
		
		//////////Delim \\s  \\\s    \\\\\\\\\\\\\\\
		
		{
			String nextLine = LineScan.nextLine();
			WordScan = new Scanner(nextLine);
			WordScan.useDelimiter("\\s*,\\s*");
			while (WordScan.hasNext()) 
			
			{
				String ClassType = WordScan.next();
				if (ClassType.compareTo("Sedan") == 0)
				
				//remember 
					
					//_temp parse double int string
				
				
				{
					String manufacturer = WordScan.next();
					String numWheels_temp = WordScan.next();
					
					int numWheels = Integer.parseInt(numWheels_temp);
					String mpg_temp = WordScan.next();
					
					
					double mpg = Double.parseDouble(mpg_temp);
					String numSeats_temp = WordScan.next();
					
					
					
					int numSeats = Integer.parseInt(numSeats_temp);
					String model = WordScan.next();
					String type_temp = WordScan.next();
					SedanTypes type = SedanTypes.valueOf(type_temp);
					String numCylinders_temp = WordScan.next();
					
					
					
					
					
					int numCylinders = Integer.parseInt(numCylinders_temp);
					String horsepower_temp = WordScan.next();
					double horsepower = Double.parseDouble(horsepower_temp);
					DBV[count] = new Sedan(manufacturer, numWheels, mpg, numSeats, model, type, numCylinders, horsepower);
					count++;
				} 
				
				//_temp values
				
				else if (ClassType.compareTo("Truck") == 0) 
				
				
				
				{
					String manufacturer = WordScan.next();
					String numWheels_temp = WordScan.next();
					
					
					
					int numWheels = Integer.parseInt(numWheels_temp);
					String mpg_temp = WordScan.next();
					
					
					
					double mpg = Double.parseDouble(mpg_temp);
					String numSeats_temp = WordScan.next();
					
					
					
					int numSeats = Integer.parseInt(numSeats_temp);
					String model = WordScan.next();
					String numAxles_temp = WordScan.next();
					
					
					
					int numAxles = Integer.parseInt(numAxles_temp);
					String grossVehicleMass_temp = WordScan.next();
					int grossVehicleMass = Integer
							
							
							
							
							.parseInt(grossVehicleMass_temp);
					String type_temp = WordScan.next();
					TruckTypes type = TruckTypes.valueOf(type_temp);
					DBV[count] = new Truck(manufacturer, numWheels, mpg, numSeats, model, numAxles, grossVehicleMass, type);
					count++;
				} 
				
				
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//All classes read


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				else if (ClassType.compareTo("MotorCycle") == 0)
				
				//_temp hold
				{
					String manufacturer = WordScan.next();
					String numWheels_temp = WordScan.next();
					
					
					
					int numWheels = Integer.parseInt(numWheels_temp);
					String model = WordScan.next();
					String weight_temp = WordScan.next();
					
					
					
					int weight = Integer.parseInt(weight_temp);
					String horsepower_temp = WordScan.next();
					
					
					
					int horsepower = Integer.parseInt(horsepower_temp);
					String mpg_temp = WordScan.next();
					
					
					//_temp hold
					
					
					
					
					double mpg = Double.parseDouble(mpg_temp);
					DBV[count] = new MotorCycle(manufacturer, numWheels, model, weight, horsepower, mpg);
					count++;
				} 
				
				
				
				else if (ClassType.compareTo("Bicycle") == 0)
				
				//temp hold vlaues
				
				{
					String manufacturer = WordScan.next();
					String numWheels_temp = WordScan.next();
					
					
					int numWheels = Integer.parseInt(numWheels_temp);
					String model = WordScan.next();
					String weight_temp = WordScan.next();
					
					
					int weight = Integer.parseInt(weight_temp);
					String CBP = WordScan.next();
					
					
					int caloriesBurnedPerHour = Integer.parseInt(CBP);
					
					
					String hasGears_temp = WordScan.next();
					boolean hasGears = Boolean.parseBoolean(hasGears_temp);
					String hasSuspensions_temp = WordScan.next();
					
					boolean hasSuspensions = Boolean
							
							
							
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Delimit parse bool


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							
							
							
							
							.parseBoolean(hasSuspensions_temp);
					
					
					DBV[count] = new Bicycle(manufacturer, numWheels, model, weight, caloriesBurnedPerHour, hasGears, hasSuspensions);
					count++;
				} 
				
				
				
				else 
				
				{
				System.out.println("Something went wrong with I/O read in.");
				}
			}
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Contruct ui panel end 
		//receive content//


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JFrame frame = new JFrame (" Project 3 Martin Murphy");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		VehiclePanel panel = new VehiclePanel(DBV);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Car db");
	}
}
