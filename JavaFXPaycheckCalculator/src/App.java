/*

Andrew B. Schaefer

This simple program was created to learn more about JavaFX GUI creation 
and to assist my wife with with calculating her middle-of-the-month paycheck. 

*/


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class App extends Application {

	@Override 
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Middle-of-the-Month Paycheck Calculator");

        // Creates new TextFields w/ Labels, submit Button, and TextArea
        Label totalHoursTextFieldLabel = new Label("Total hours worked");
        TextField totalHoursTextField = new TextField();

        Label domesticPerDiemTextFieldLabel = new Label("Total domestic" + 
        " per diem hours");
        TextField domesticPerDiemTextField = new TextField();

        Label internationalPerDiemTextFieldLabel = new Label("Total international" + 
        " per diem hours");
        TextField internationalPerDiemTextField = new TextField();

        Button calculateButton = new Button("Calculate Paycheck Amount");

        TextArea paycheckAmountTextArea = new TextArea();
        paycheckAmountTextArea.setMaxHeight(100);


        // Button action calls Paycheck.calculatePaycheck() method
        calculateButton.setOnAction(e -> {
            //Retrieving data
            double totalHours = Double.parseDouble(totalHoursTextField.getText());
            double domesticPerDiemHours = Double.parseDouble(domesticPerDiemTextField.getText());
            double internationalPerDiemHours = Double.parseDouble(internationalPerDiemTextField.getText());

            String totalAmount = "Your paycheck will be: $" 
            + String.valueOf(Paycheck.calculatePaycheck(
                totalHours, domesticPerDiemHours, internationalPerDiemHours));

            paycheckAmountTextArea.setText(totalAmount);
         });


        // Creates a new VBox 
        VBox vbox = new VBox(totalHoursTextFieldLabel, totalHoursTextField, 
                            domesticPerDiemTextFieldLabel, domesticPerDiemTextField, 
                            internationalPerDiemTextFieldLabel, internationalPerDiemTextField, 
                            calculateButton, paycheckAmountTextArea);

        vbox.setStyle("-fx-border-color: lightblue;" + "-fx-border-width: 15");
        vbox.setPadding(new Insets(20, 50, 50, 50));
        vbox.setSpacing(7);
        vbox.setAlignment(Pos.CENTER);

        // Creates scene 
		Scene scene = new Scene(vbox, 500, 500);
        // Places scene in stage
		primaryStage.setScene(scene);
        // Displays stage
		primaryStage.show(); 
	}


    public static void main(String[] args) {
        Application.launch(args);
    }
}
