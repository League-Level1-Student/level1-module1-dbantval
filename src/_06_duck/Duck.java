package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
Duck(int numberOfFriends, String favoriteFood){
	
	this.numberOfFriends = numberOfFriends;
this.favoriteFood= favoriteFood;
}
	void quack() {
		System.out.println("The duck quacked and lost his voice the next day. Ducko sad.");
	}

	void waddle() {
		System.out.println("The duck waddled and fell face-first onto the ground.Ducko depressed.");

	}

}
