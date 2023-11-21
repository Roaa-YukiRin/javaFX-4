/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineexample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
//NEW
//import javafx.scene.shape.Line;

//import javafx.scene.shape.Rectangle;

//import javafx.scene.shape.Circle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author HP
 */
public class LineExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        //NEW
//        Line line = new Line(); 
//    line.setStartX(100.0f); //Setting the Properties of the Line
//    line.setStartY(140.0f);
//    line.setEndX(300.0f);
//    line.setEndY(140.0f);
//    
//    Group root = new Group(line);
//    
//    Scene scene = new Scene(root, 400, 300);
//    primaryStage.setTitle("Drawing Line"); // Set the stage title
//    primaryStage.setScene(scene); // Place the scene in the stage
//    primaryStage.show(); // Display the stage
        //NEW
//        Rectangle rectangle = new Rectangle(); 
//        rectangle.setX(100); //Setting the Properties of the Rectangle
//        rectangle.setY(100);
//        rectangle.setWidth(200);
//        rectangle.setHeight(100);
//
//        Group root = new Group(rectangle);
//        Scene scene = new Scene(root, 400, 300);
//        primaryStage.setTitle("Drawing Rectangle"); // Set the stage title
//        primaryStage.setScene(scene); // Place the scene in the stage
//        primaryStage.show(); // Display the stage

//    //NEW
//    Circle circle = new Circle(); 
//    circle.setCenterX(200); //Setting the Properties of the Circle
//    circle.setCenterY(150);
//    circle.setRadius(50);
//    Group root = new Group(circle);
//    Scene scene = new Scene(root, 400, 300);
//    primaryStage.setTitle("Drawing Rectangle"); // Set the stage title
//    primaryStage.setScene(scene); // Place the scene in the stage
//    primaryStage.show(); // Display the stage

//IMAGE
 
    Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQs1XBoCplUS1v2gkTinxGVh20QnCy-DWy8lyQDTvt-ldf0WINZ");
    
    ImageView imageView = new ImageView(image);//Setting the image view 
    imageView.setX(50); //Setting the image position
    imageView.setY(25);
    imageView.setFitHeight(200); //setting the fit height and width of the image view
    imageView.setFitWidth(200);
    imageView.setPreserveRatio(true); //Setting the preserve ratio of the image view 
    
    Group root = new Group(imageView); //Creating a Group object 
    
    Scene scene = new Scene(root, 250, 250);//Creating a scene object 
    primaryStage.setTitle("Image Example"); //Setting title to the Stage
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
