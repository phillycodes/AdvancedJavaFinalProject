package com.Exam.school;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.Initializable;

public class activityControllers implements Initializable {

    @FXML private BorderPane mainPaneBorder;

    @FXML private Label personLabel;

    //Every Person has a Name and age and address and gender
    	//{ Labels that Make up the Name
    @FXML private Label firstNameLabel;
    @FXML private Label middleInitialLabel;
    @FXML private Label lastNameLabel;
    				//Text Fields
    @FXML private TextField firstNameTf;
    @FXML private TextField middleInitialTf;
    @FXML private TextField lastNameTf;
    @FXML private TextField ageTf;
    @FXML private Name completeName;
    //}
    @FXML private Label ageLabel;
    @FXML private Label personIDLabel;
    @FXML private Label DOBLabel;
    @FXML private Label gender;
    	//{Information for the Address
    @FXML private Address theAddress;
    @FXML private TextField stNumField;
    @FXML private TextField stNameField;
    @FXML private TextField cityField;
    @FXML private TextField stTypeField;
    @FXML private TextField stCodeField;
    @FXML private TextField zipCodeField;
    	//}
    
    	//For Janitors
    @FXML private Label smokerBoolean;
    @FXML private Label yearsServiceLabel;
    @FXML private Label hourlyRateLabel;
    
    @FXML private RadioButton smokerYesChoice;
    @FXML private RadioButton smokerNoChoice;
    @FXML ToggleGroup smokerToggleGroup;
   
    
    	
    
    @FXML private TextArea displayInfoTextArea;

    @FXML private GridPane grid;
    @FXML private ComboBox personComboBox;
    
    @FXML private Button enterInformationButton;

    @FXML void firstNameTextFieldChanged(ActionEvent event) {
    	displayInfoTextArea.appendText(firstNameTf.getText() + " ");
    	String firstName = firstNameTf.getAccessibleText();
    	System.out.println(firstName);
    }
    @FXML void middleTextFieldChanged(ActionEvent event) {
    	displayInfoTextArea.appendText(middleInitialTf.getText() + " ");
    }
    @FXML void lastNameTextFieldChanged(ActionEvent event) {
    	displayInfoTextArea.appendText(lastNameTf.getText() + " ");
    }
    
    @FXML void ageTextFieldChanged(ActionEvent event) {
    	int age =  Integer.parseInt(ageTf.getText());
    }
    @FXML void comboBoxSelection(ActionEvent event) {
    	if(personComboBox.getValue().toString() == "Janitor")
    	firstNameTf.setDisable(true);
    	else {
        	firstNameTf.setDisable(false);    		
    	}
    }
    
    @FXML void informtionButtonClicked(ActionEvent event) {
    	displayInfoTextArea.appendText(firstNameTf.getText() + " " + middleInitialTf.getText() + " " + lastNameTf.getText());
    	completeName = new Name(firstNameTf.getText(), lastNameTf.getText(), middleInitialTf.getText());
    	theAddress = new Address(stNumField.getText(), stNameField.getText(), stTypeField.getText(), cityField.getText(), stCodeField.getText(), zipCodeField.getText());
    	
    	System.out.println(completeName + "\n" + theAddress); // checking code Accuracy
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   personComboBox.getItems().addAll("Janitor", "Student", "Teacher");
    	 smokerToggleGroup = new ToggleGroup();
    	 this.smokerYesChoice.setToggleGroup(smokerToggleGroup);
    	 this.smokerNoChoice.setToggleGroup(smokerToggleGroup);
    }

}
