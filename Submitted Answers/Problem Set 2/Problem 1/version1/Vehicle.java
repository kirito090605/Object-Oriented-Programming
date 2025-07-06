public class Vehicle
{
	public double load;
	public double maxLoad;

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
}
