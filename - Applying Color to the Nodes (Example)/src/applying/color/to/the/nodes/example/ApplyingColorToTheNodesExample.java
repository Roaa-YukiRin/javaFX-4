/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applying.color.to.the.nodes.example;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author HP
 */
public class ApplyingColorToTheNodesExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
            Circle circle = new Circle();//Drawing a Circle
    circle.setCenterX(300.0f); //Setting the properties of the circle
    circle.setCenterY(150.0f);
    circle.setRadius(90.0f);
    //NEW
//    circle.setFill(Color.DARKRED);//Setting color to the circle
    circle.setStrokeWidth(3); //Setting the stroke width
    circle.setStroke(Color.DARKSLATEBLUE); //Setting color to the stroke
    
    
    Text text = new Text("This is a colored circle");//Drawing a text
    text.setFont(Font.font("Edwardian Script ITC", 50));//Setting the font of the text
    text.setX(40);//Setting the position of the text
    text.setY(50);
//    //NEW
//    text.setFill(Color.BEIGE);//Setting color to the text
    text.setStrokeWidth(2);
    text.setStroke(Color.DARKSLATEBLUE);
    
    //Setting the image pattern 
        Image image = new Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRQub4GvEezKMsiIf67UrOxSzQuQ9zl5ysnjRn87VOC8tAdgmAJjcwZ2qM") ;
        ImagePattern pattern = new ImagePattern(image,20,20,40,40,false);
        //Setting the image pattern to the circle and text
        circle.setFill(pattern);
        text.setFill(pattern);
    Group root = new Group(circle, text); //Creating a Group object
    Scene scene = new Scene(root, 600, 300); //Creating a scene object
    primaryStage.setTitle("Color Example"); //Setting title to the Stage
    primaryStage.setScene(scene); //Adding scene to the stage
   primaryStage.show();//Displaying the contents of the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
