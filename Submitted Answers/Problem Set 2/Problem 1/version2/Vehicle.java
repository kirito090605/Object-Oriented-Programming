public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.maxLoad = maxLoad;
		this.load = 0;
	}

	public double getLoad()
	{
		return load;
	}

	public double getMaxLoad()
	{
		return maxLoad;
	}

	public boolean addBox(double weight)
	{
		if(load + weight <= maxLoad)
		{
			load += weight;
			return true;
		}
		else
		{
			return false;
		}
	}
}