
// Andrew Schaefer

// This simple program demonstrates the use of JavaFX Shapes, Color, and 
// EventHandler classes.

// Assignment instructions: Write a program that displays various figures 
// such as a Circle, a Rectangle, or an Ellipse. Include radio buttons 
// selections for changing the display figure to the one selected. Include 
// a checkbox for filling and clearing the displayed figure with a random color.


// Imports the necessary JavaFX packages
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;


// Creates an JavaFXGUI class that inherits from Application
public class JavaFXGUI extends Application {

    // Creates a new Circle object with dimension specification
    Circle circle = new Circle(50);
    // Creates a new Ellipse object
    Ellipse ellipse = new Ellipse();
    // Creates a new Rectangle object
    Rectangle rectangle = new Rectangle();


    // Overrides the start method in the Application class
	@Override 
	public void start(Stage primaryStage) {

        // Specifies Circle object initial color
        circle.setFill(Color.WHITE);

        // Specifies Ellipse object dimensions and initial color
        ellipse.setFill(Color.WHITE);
        ellipse.setRadiusX(100);
        ellipse.setRadiusY(50);
        
        // Specifies Rectangle object dimensions and initial color
        rectangle.setFill(Color.WHITE);
        rectangle.setHeight(100);
        rectangle.setWidth(150);


        // Creates a new StackPane object with dimension and style specifications
        StackPane sPaneForShapes = new StackPane();
        sPaneForShapes.setStyle("-fx-border-color: green;" + "-fx-border-width: 5");
        sPaneForShapes.setMinHeight(500);
        sPaneForShapes.setMaxHeight(500);
        sPaneForShapes.setMinWidth(600);
        sPaneForShapes.setMaxWidth(600);


        // Creates a new HBox object with dimension and style specifications
        HBox hBoxForButtons = new HBox();
        hBoxForButtons.setStyle("-fx-border-color: green;" + "-fx-border-width: 5");
        hBoxForButtons.setMinHeight(75);
        hBoxForButtons.setMinWidth(800);
        hBoxForButtons.setSpacing(150);


        // Creates a new CheckBox object
        CheckBox cBox = new CheckBox("Color");

        // Creates 3 Radio Button objects to represent shapes
        RadioButton rbCircle = new RadioButton("Circle");
        rbCircle.setAlignment(Pos.CENTER_LEFT);
        RadioButton rbEllipse = new RadioButton("Ellipse");
        rbCircle.setAlignment(Pos.CENTER);
        RadioButton rbRectangle = new RadioButton("Rectangle");
        rbCircle.setAlignment(Pos.CENTER_RIGHT);


        // Creates a Toggle Group object and adds the Radio Buttons to it
        ToggleGroup group = new ToggleGroup();
        rbCircle.setToggleGroup(group);
        rbEllipse.setToggleGroup(group);
        rbRectangle.setToggleGroup(group);


        // Adds Radio Buttons and CheckBox to HBox
        hBoxForButtons.getChildren().addAll(rbCircle, rbEllipse, rbRectangle, cBox);

        // Adds shapes to StackPane
        sPaneForShapes.getChildren().addAll(circle, ellipse, rectangle);


        // Creates a BorderPane object with dimension specifications
        BorderPane pane = new BorderPane();
        pane.setMinWidth(700);
        pane.setMinHeight(700);
        // Adds HBox and StackPane to BorderPane
        pane.setTop(hBoxForButtons);
        pane.setCenter(sPaneForShapes);



        // Registers Event Handler for rbCircle
        rbCircle.setOnAction(e -> {
            // Determines if the Radio Button is selected and acts accordingly
            if (rbCircle.isSelected()) {
                sPaneForShapes.getChildren().clear();
                sPaneForShapes.getChildren().add(circle);
            }
        });

        // Registers Event Handler for rbEllipse
        rbEllipse.setOnAction(e -> {
            // Determines if the Radio Button is selected and acts accordingly
            if (rbEllipse.isSelected()) {
                sPaneForShapes.getChildren().clear();
                sPaneForShapes.getChildren().add(ellipse);
            }
        });

        // Registers Event Handler for rbRectangle
        rbRectangle.setOnAction(e -> {
            // Determines if the Radio Button is selected and acts accordingly
            if (rbRectangle.isSelected()) {
                sPaneForShapes.getChildren().clear();
                sPaneForShapes.getChildren().add(rectangle);
            }
        });

        // Registers Event Handler for cBox
        cBox.setOnAction(e -> {
            // Determines if the CheckBox is selected and acts accordingly
            if (cBox.isSelected()) {
                circle.setFill(Color.BLUE);
                ellipse.setFill(Color.BLUE);
                rectangle.setFill(Color.BLUE);
            }
            else {
                circle.setFill(Color.WHITE);
                ellipse.setFill(Color.WHITE);
                rectangle.setFill(Color.WHITE);
            }
        });
         
    
        // Initializes with a clear Stack Pane
        sPaneForShapes.getChildren().clear();


        // Sets the stage title
		primaryStage.setTitle("Schaefer - JavaFXGUI");
        // Creates a scene instance and places it in the stage
		Scene scene = new Scene(pane);
        // Places the scene in the stage
		primaryStage.setScene(scene);
        // Displays the stage
		primaryStage.show(); 
	}

       
    // Main method
    public static void main(String[] args) {
        Application.launch(args);
    }
}
