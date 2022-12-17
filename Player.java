package week6project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	
	private int score = 0;
	
	private String name;
	
	
	public List<Card> getHand() {
		return hand;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public void describe(Player p) {
		System.out.println("Player Info: ");
		System.out.println("Name: " + p.getName());
		System.out.println("Score: " + p.getScore());
		System.out.println("Hand: " + p.getHand());
	}
	
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	public void draw(Deck d) {
		hand.add(d.draw());
		
	}
	
	public void incrementScore() {
		score++;
	}
}
