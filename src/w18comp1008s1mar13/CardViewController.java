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

    @FXML
    void dealCardButtonPushed(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        CardDeck deck = new CardDeck();
        Card card = deck.dealTopCard();
        
        this.faceNameTextField.setText(card.getFaceName());
        this.faceValueTextField.setText(Integer.toString(card.getFaceValue()));
        this.suitTextField.setText(card.getSuit());
        this.imageView.setImage(card.getCardImage());
    }    
    
}
