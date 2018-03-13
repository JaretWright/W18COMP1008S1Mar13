package w18comp1008s1mar13;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JWright
 */
public class CardDeck {
    private ArrayList<Card> deck;
    
    /**
     * This is a 0 argument constructor
     */
    public CardDeck()
    {
        deck = new ArrayList<>();
        String[] faceNames = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] suits = {"spades","clubs","diamonds","hearts"};
        
        for (int suit=0; suit<suits.length; suit++)
        {
            for (int face=0; face<faceNames.length; face++)
                deck.add(new Card(faceNames[face], suits[suit], face+2));
        }
    }
    
    public void displayDeck()
    {
        for (Card card:deck)
            System.out.println(card.toString());
    }
    
    /**
     * This method will remove and return the top card from the deck
     */
    public Card dealTopCard()
    {
        //ensure there are still cards in the deck
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }
    
    /**
     * This method will randomize the order of the cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    /**
     * This method will return a random card from the deck
     */
    public Card getRandomCard()
    {
        SecureRandom rng = new SecureRandom();
        return deck.remove(rng.nextInt(deck.size()));
    }
    
    /**
     * This method will return the number of cards currently in the deck
     */
    public int getNumOfCardsInDeck()
    {
        return deck.size();
    }
}
