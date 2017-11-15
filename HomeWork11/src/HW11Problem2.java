
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HW11Problem2 extends Application{

    //Override the start method in Application class.
    @Override
    public void start(Stage primaryStage) {
        
        //Set the pane of Horizontal Box type with properties.
        HBox pane=new HBox(10);
        pane.setPadding(new Insets(10,10,10,10));
        
        //Create an ArrayList object of Image type to store all the cards.
        ArrayList<Image> cards=new ArrayList();
        for (int i=1; i<53; i++) {
            
            String s="image/card/"+i+".png"; //Add cards from the 'image/card' folder.
            cards.add(new Image(s));
        }
        Collections.shuffle(cards); //Shuffle the cards to pick three random cards.
        
        //Pick the first three cards from the 'shuffled deck'.
        pane.getChildren().add(new ImageView(cards.get(0)));
        pane.getChildren().add(new ImageView(cards.get(1)));
        pane.getChildren().add(new ImageView(cards.get(2)));
        
        //Set the pane on a scene.
        Scene scene=new Scene(pane);
        primaryStage.setTitle("Random Cards"); //Give the stage a title.
        primaryStage.setScene(scene); //Put the scene on a stage.
        primaryStage.show(); //Display the stage.
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }//end main
}//end HW11Problem2
