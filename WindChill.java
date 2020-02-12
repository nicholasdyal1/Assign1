import java.util.Scanner;
public class WindChill {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double temperature;
		double windSpeed;
		final double NUM4=.4275;
		final double NUM1=35.74;
		final double NUM2=.6215;
		final double NUM3 = 35.75;

		System.out.println("Wind Chill Calculator");
		System.out.println("Enter the temperature in Fahrenheit(must be >=-45 and <=40): ");
		temperature= scan.nextDouble();

		if(temperature <=-45 || temperature >=40) {
			System.out.println("This is not between the values");
		}	

		else 
		{
			System.out.println("Enter the wind speed (must be >=5 and <=60):");
			windSpeed=scan.nextDouble();
	
			if(windSpeed <=5 || windSpeed >=60) {
				System.out.println("This is not between the values");
			}	
			else 
			{
	
				double x = Math.pow(windSpeed, .16); //x = v^.16
				double y = NUM2*temperature; // y = .6215T
				double z = NUM3*x; // z = 35.75*x
				double c = NUM4*temperature; // c = .4275T
				double i = c*x; //.4275T*(V.16)
				double sum = NUM1+y-z+i;
				System.out.println("Wind Chill temperature: " + sum + " degrees Fahrenheit" );
				System.out.println("Programmer name: Nicholas Dyal");
			}
		}

	}

}
