package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

private int positionInRace;
public boolean damaged = false;


public class RaceCarRunner {
	private String brand;
	private int positionInRace;
	public boolean damaged = false;
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
<<<<<<< HEAD
		public RaceCar(String brand, int positionInRace) {
			System.out.println("Your " +brand +" race car has been created.");
			if (positionInRace <= 0)
				throw new IllegalArgumentException("The car's position cannot be negative.");
			else if (positionInRace > 15) 
				throw new IllegalArgumentException("There are only 15 cars in the race.");
=======
		RaceCar car = new RaceCar("Ferrari", 5); 
>>>>>>> branch 'master' of https://github.com/League-Level1-Student/level1-module1-dbantval.git
		// 2. Print the RaceCar's position in the race
System.out.println(car.getPositionInRace());
		// 3. Crash the RaceCar
car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
car.isDamaged();

car.pit();
		// 5. Help the car move into first place.
for ( int i = 0; i < 7; i++){ car.overtake();
}
	}
}
