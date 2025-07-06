public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.maxLoad = kiloToNewts(maxLoad);
		this.load = 0;
	}

	public double getLoad()
	{

		return newtsToKilo(load);
	}

	public double getMaxLoad()
	{
		return newtsToKilo(maxLoad);
	}

	public boolean addBox(double weight)
	{
		double weightInNewtons = kiloToNewts(weight);

		if(load + weightInNewtons <= maxLoad)
		{
			load += weightInNewtons;
			return true;
		}
		else
		{
			return false;
		}
	}

	private double kiloToNewts (double weight) 
	{
		return (weight * 9.8);
	}

	private double newtsToKilo (double weight) 
	{
		return (weight / 9.8);
	}

}