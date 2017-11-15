
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HW11Problem1 extends Application {

    //Override the start method in Application class.
    @Override
    public void start(Stage primaryStage) {
    
        //Set the pane of Grid type with properties.
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(10);
        pane.setVgap(10);
        
        //Assign variables for the four images.
        Image image1=new Image("image/flag1.gif");
        Image image2=new Image("image/flag3.gif");
        Image image3=new Image("image/flag5.gif");
        Image image4=new Image("image/flag6.gif");
        
        //Add the four images to the pane on specific locations on the grid.
        pane.add(new ImageView(image1), 0, 0);
        pane.add(new ImageView(image2), 1, 0);
        pane.add(new ImageView(image3), 0, 1);
        pane.add(new ImageView(image4), 1, 1);
        
        //Set the pane on a scene.
        Scene scene=new Scene(pane);
        primaryStage.setTitle("My Flags"); //Give the stage a title.
        primaryStage.setScene(scene); //Put the scene on a stage.
        primaryStage.show(); //Display the stage.
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }//end main
}//end HW11Problem1
