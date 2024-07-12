package genralization;

public class mainCar {
	
	static void genralization(cars cars)
	{
		EvCar car = null;
		if(cars instanceof EvCar)
		{
			 car = (EvCar)cars;
			
		}
		System.out.println(car.batteryCapacity);
		
			
	}
	
	public mainCar() {
		
		 cars cars = new EvCar();
		 
	}

}
