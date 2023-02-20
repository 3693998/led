/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.grupo3.javafxled;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;


/**
 * FXML Controller class
 *
 * @author calde
 */
public class LedController implements Initializable {

    @FXML
    private ShapeLed shapeLed;
    @FXML
    private ColorPicker pickerLed;
    @FXML
    private ToggleButton bootnOn;

    @FXML
    private ColorPicker pickerBorder;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        bootnOn.setText("On");
        bootnOn.setStyle("-fx-background-color: green;");
    }   

    //********** Ejercicio 4 ***********************
    @FXML
    private void cambioLed(ActionEvent event) {

        shapeLed.setLedColor(pickerLed.getValue());

    }
    //********** Ejercicio 4 ***********************

    @FXML
    void cambioBorder(ActionEvent event) {

        shapeLed.setBorderColor(pickerBorder.getValue());
    }

    //********** Ejercicio 4 ***********************
    @FXML
    private void onLed(ActionEvent event) {

       

        if (shapeLed.isOn()) {
            bootnOn.setText("on");
            bootnOn.setStyle("-fx-background-color: green;");
            shapeLed.setOn(false);
            
           
        } else {
              
            bootnOn.setText("Off");
            bootnOn.setStyle("-fx-background-color: red;");
            shapeLed.setOn(true);
             
        }

    }

}
