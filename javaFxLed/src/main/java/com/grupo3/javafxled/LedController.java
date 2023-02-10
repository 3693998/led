/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.grupo3.javafxled;

import com.grupo3.javafxled.ShapeLed;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

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
    private ColorPicker pickerBorde;
    @FXML
    private ToggleButton bootnOn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void cambioLed(ActionEvent event) {
       
    shapeLed.setLedColor(pickerLed.getValue());
    shapeLed.setBorderColor(pickerLed.getValue());

    }

    @FXML
    private void cambioBorder(ActionEvent event) {
        
        
    }

    @FXML
    private void onLed(ActionEvent event) {
        bootnOn.setText("On");
        if (shapeLed.isBlinking()) {
            shapeLed.setBlinking(false);

        } else {
            bootnOn.setText("Off");
            shapeLed.setBlinking(true);

        }
    }

}
