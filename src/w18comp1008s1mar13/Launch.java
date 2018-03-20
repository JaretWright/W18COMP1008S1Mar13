package w18comp1008s1mar13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class Launch extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("CardView.fxml"));
       Parent parent  = loader.load();
       
       Scene scene = new Scene(parent);
       primaryStage.setTitle("Super awesome card viewer thingy");
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
