public class Fish extends Animal implements Pet 
{
	private String name;

	public Fish() 
	{
        super(0);
    }

    @Override
    public void eat() 
    {
        System.out.println(this.name + " is eating fish snacks.");
    }

    @Override
    public void walk() 
    {
        System.out.println("Fish can't walk; they swim.");
    }

    @Override
    public void play() 
    {
        System.out.println(this.name + " is playing with bubbles.");
    }

    @Override
    public String getName() 
    {
        return this.name;
    }

    @Override
    public void setName(String name) 
    {
        this.name = name;
    }
}
