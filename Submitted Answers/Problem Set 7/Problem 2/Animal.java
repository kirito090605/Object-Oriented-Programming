public abstract class Animal
{
	protected int legs;

	protected Animal(int legs)
	{
		this.legs = legs;
	}

	public void walk()
	{
		System.out.println("This animal can walk on " + legs + " legs.");
	}
	public abstract void eat();
}