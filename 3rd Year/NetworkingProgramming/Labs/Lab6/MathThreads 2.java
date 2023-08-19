import java.lang.Math;

class MathThreads 
{
	public static void main(String args[]) 
	{
		MathSin math1 = new MathSin(50);
		MathCos math2 = new MathCos(90);
		MathTan math3 = new MathTan(40);

		math1.start();
		math2.start();
		math3.start();

		try 
		{ 
			// wait for completion of all thread and then sum
			math1.join();
			math2.join(); 
			math3.join();

			double total = math1.total + math2.total + math3.total;

			System.out.println("\nSum of sin,cos and tan is: " + total + "\n");
		}

		catch(Exception e) 
		{
			System.out.println(e);
		}
	}	
}

class MathSin extends Thread 
{
	public double deg;
	public double total;
	public MathSin(int degree) 
	{
		deg = degree;
	}

	public void run() 
	{
		System.out.println("sin of: " + deg);
		double Deg2Rad = Math.toRadians(deg);

		// degree to radian
		total = Math.sin(Deg2Rad);
		System.out.println("Exit from MathSin result is: "+ total);
	}	 
}

class MathCos extends Thread 
{
	public double deg;
	public double total;

	public MathCos(int degree) 
	{
		deg = degree;
	}

	public void run() 
	{
		System.out.println("cos of: " + deg);
		double Deg2Rad = Math.toRadians(deg);

		// degree to radian
		total = Math.cos(Deg2Rad);
		System.out.println("Exit from MathCos result is: " + total);
	}	
}

class MathTan extends Thread 
{
	public double deg;
	public double total;

	public MathTan(int degree) 
	{
 		deg = degree;
	}

	public void run() 
	{
		System.out.println("tan of: " + deg);
		double Deg2Rad = Math.toRadians(deg);

		// degree to radian
		total = Math.tan(Deg2Rad);
		System.out.println("Exit from MathTan result is: "+ total);
	}	
}
	
