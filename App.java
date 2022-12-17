package week6project;

public class App {

	public static void main(String[] args) {
		App war = new App();
		war.playGame();
	}
	
		private void playGame() {
		Deck d = new Deck();
		
		d.shuffle();
		
		Player player1 = new Player();
		Player player2 = new Player();
		player1.setName("John Smith");
		player2.setName("Rose Tyler");
		
		drawCards(d, player1, player2);
		flipCards(player1, player2);
		findWinner(player1, player2);
	}
		
		
		private void drawCards(Deck d, Player player1, Player player2) {
			for(int i = 0; i < 52; i++) {
				if (i % 2 == 0) {
					player1.draw(d);
				} else { player2.draw(d);}
		}
//			I wrote this code to see make sure the draw and flip functions were working right
//			by comparing what was in their hand and what they played. and making sure the 
//			hands were both the same size. 
//			System.out.println("player 1 hand");
//			for(int i = 0; i < player1.getHand().size(); i++) {
//			
//			player1.getHand().get(i).describe(player1.getHand().get(i));
//		}
//			System.out.println("player 2 hand");
//			for(int i = 0; i < player2.getHand().size(); i++) {
//			
//			player2.getHand().get(i).describe(player2.getHand().get(i));
//		}
		}
		
		private void flipCards(Player player1, Player player2) {
		for(int i = 0; i < 26; i++) {
			Card x = player1.flip();
			Card y = player2.flip();
			System.out.println(player1.getName() + " played: " + x.getName());
			System.out.println(player2.getName() + " played: " + y.getName());
			if(x.getValue() > y.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " got a point!");
			} else if(y.getValue() > x.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " got a point!");
			} else { System.out.println("Tie! No points.");
		}
			System.out.println(player1.getName() + "'s Score is: " + player1.getScore());
			System.out.println(player2.getName() + "'s Score is: " + player2.getScore());
	}
		}
		
		private void findWinner(Player player1, Player player2) {
		System.out.println(player1.getName() + "'s Final Score is: " + player1.getScore());
		System.out.println(player2.getName() + "'s Final Score is: " + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1, " + player1.getName() + ", Wins!");
		} else if(player1.getScore() < player2.getScore()) {
			System.out.println("Player 2, " + player2.getName() + ", Wins!");
		} else {System.out.println("Draw"); }
		
	
	}

}
