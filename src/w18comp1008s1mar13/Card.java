package w18comp1008s1mar13;

import javafx.scene.image.Image;

/**
 *
 * @author JWright
 */
public class Card {
    private String faceName, suit;
    private int faceValue; //aces will be high
    private Image cardImage;
    
    /**
     * Here is our constructor.  Note no return type
     */
    public Card(String faceName, String suit, int value)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(value);
        setCardImage(new Image(getImageFileName()));
    }

    public Image getCardImage()
    {
        return cardImage;
    }

    public void setCardImage(Image cardImage)
    {
        this.cardImage = cardImage;
    }
    
    
    
    /**
     * This method will return a String with the file name
     * of the card
     * @return 
     */
    public String getImageFileName()
    {
        return String.format("/images/%s_of_%s.png", getFaceName(),
                                                           getSuit());
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        String[] validNames = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        
        //loop over the array and make sure the face name exists
        for (String validName : validNames)
        {
            if (validName.equalsIgnoreCase(faceName))
            {
                this.faceName = faceName;
                return;
            }
        }
        throw new IllegalArgumentException("Strings must be 2-10, Jack, Queen, King or Ace");
        
        
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String newSuit) {
        if (newSuit.equalsIgnoreCase("hearts") || newSuit.equalsIgnoreCase("diamonds")
                || newSuit.equalsIgnoreCase("clubs") || newSuit.equalsIgnoreCase("spades")){
            this.suit = newSuit;    
        }
        else
            throw new IllegalArgumentException("Suit must be hearts, diamonds, clubs or spades");
        
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >1 && faceValue <=14)
            this.faceValue = faceValue;
        else
            throw new IllegalArgumentException("Card values must be 2-14 inclusive");
    }
    
    /**
     * This method will describe a card as the face of suit.  For example
     * "2 of spades".  This overrides the toString() method inherited from 
     * the object class
     */
    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }
    
}
