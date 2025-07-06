public class TestMyPoint
{
	public static void main(String[] args)
	{
		MyPoint start = new MyPoint(10,10);
		MyPoint end = new MyPoint(20,30);

		System.out.println ("Start point is " + start);
		System.out.println ("End point is " + end);

		MyPoint stray = end;

		System.out.println ("Stray point is " + stray);
		System.out.println ("End point is " + end);

		stray.x = 47;
		stray.y = 30;

		System.out.println ("Stray point is " + stray);
		System.out.println ("End point is " + end);
		System.out.println ("Start point is " + start);
	}
}