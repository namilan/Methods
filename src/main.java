
public class Main {

	public static void main(String[] args) {
		boolean gameOver = true; 
		boolean secondScore = true;
		int score = 800;
		int secondScore1 = 10000;
		int levelCompleted = 5;
		int secondScoreLevel = 8;
		int bonus = 100;
		int secondBonus = 200;

		calculateScore();
		
		if (secondScore) {
			int finalScoreSecond = secondScore1 + ( secondScoreLevel * secondBonus );
			System.out.println("Your final score was " + finalScoreSecond);
		}

	}
	
	public static void calculateScore() {
		boolean gameOver = true; 
		int score = 800;
		int levelCompleted = 5; 
		int bonus = 100; 
		
		if (gameOver) {
			int finalScore = score + ( levelCompleted * bonus); 
			finalScore +=1000;
			System.out.println("Your final score was " + finalScore);
		}
	}

}
