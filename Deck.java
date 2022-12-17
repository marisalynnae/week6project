package week6project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private String[] cardSuit = {"Diamonds", "Hearts", "Spades", "Clubs"};

	private List<Card> cards = new ArrayList<Card>(); 
	
	public Deck() {
		for(String suit : cardSuit) {
			for(int i = 2; i <= 14; i++) {
				Card c = new Card();
				c.setValue(i);
				if(i <= 10) {
					c.setName(i + " of " + suit); 
				} else if(i == 11) {
					c.setName("Jack of " + suit);
				} else if(i == 12) {
					c.setName("Queen of " + suit);
				} else if(i == 13) {
					c.setName("King of " + suit);
				} else { 
					c.setName("Ace of " + suit);
				}
				cards.add(c);
			}
		}
		
		
	}
	public void printDeck() {
		for(Card c:cards) {
			System.out.println(c.getName() + " : " + c.getValue());
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
}
	

