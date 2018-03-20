package w18comp1008s1mar13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class CardViewController implements Initializable
{
    @FXML    private ImageView imageView;
    @FXML    private TextField faceNameTextField;
    @FXML    private TextField suitTextField;
    @FXML    private TextField faceValueTextField;
             private Card activeCard;
             private CardDeck deck;
             
    @FXML
    public void dealCardButtonPushed(ActionEvent event) {
        activeCard = deck.dealTopCard();
        updateView();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        deck = new CardDeck();
        deck.shuffle();
        activeCard = deck.dealTopCard();
        updateView();
    }    
    
    public void updateView()
    {
        this.faceNameTextField.setText(activeCard.getFaceName());
        this.faceValueTextField.setText(Integer.toString(activeCard.getFaceValue()));
        this.suitTextField.setText(activeCard.getSuit());
        this.imageView.setImage(activeCard.getCardImage());
    }
}
