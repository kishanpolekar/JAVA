
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HW11Problem3 extends Application{

    //Override the start method in Application class.
    @Override
    public void start(Stage primaryStage) {
        
        //Set the Pane with its properties.
        Pane pane=new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        
        //Create a circle shape object for the face. Set properties.
        Circle face=new Circle(100);
        face.setCenterX(125);
        face.setCenterY(125);
        face.setStroke(Color.rgb(250,190,65));
        face.setFill(Color.rgb(250,205,80));
        
        //Create a circle shape object for the eyeball. Set properties.
        Circle eyeball=new Circle(15);
        eyeball.setCenterX(175);
        eyeball.setCenterY(100);
        eyeball.setStroke(Color.BLACK);
        eyeball.setFill(Color.WHITE);
        
        //Create a circle shape object for the eye. Set properties.
        Circle eye=new Circle(7.5);
        eye.setCenterX(175);
        eye.setCenterY(100);
        eye.setFill(Color.BLACK);
        
        //Create a line shape object for the closed eye. Set properties.
        Line closed_eye=new Line();
        closed_eye.setStartX(60);
        closed_eye.setStartY(100);
        closed_eye.setEndX(90);
        closed_eye.setEndY(100);
        closed_eye.setFill(Color.BLACK);
        closed_eye.setStrokeWidth(3);
        
        //Create an arc shape object for the mouth. Set properties.
        Arc mouth=new Arc(125,140,75,50,200,140);
        mouth.setType(ArcType.CHORD);
        mouth.setFill(Color.BROWN);
        
        //Create an arc shape object for the tongue. Set properties.
        Arc tongue=new Arc(125,160,30,70,180,180);
        tongue.setType(ArcType.CHORD);
        tongue.setFill(Color.DEEPPINK);
        tongue.setStroke(Color.PINK);
        
        //Add all the shapes to the pane.
        pane.getChildren().add(face);
        pane.getChildren().add(eyeball);
        pane.getChildren().add(eye);
        pane.getChildren().add(closed_eye);
        pane.getChildren().add(mouth);
        pane.getChildren().add(tongue);
        
        //Set the pane on a scene.
        Scene scene=new Scene(pane,250,250);
        primaryStage.setTitle("Face with stuck-out tongue and winking eye"); //Give the stage a title.
        primaryStage.setScene(scene); //Put the scene on a stage.
        primaryStage.show(); //Display the stage.
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }//end main
}//end HW11Problem3
