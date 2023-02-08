/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.grupo3.javafxled;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author calde
 */
public class LedController implements Initializable {

    @FXML
    private ShapeLed shapeLed;
    // ejericcio 2  Modifica la propiedad hover del control para cambiar su color al pasar el ratón por encima.
    @FXML
    void editColor(MouseEvent event) {
      
        
      Random random = new Random();
      float a = random.nextFloat();
      float b = random.nextFloat();
      float c = random.nextFloat();
      float d = random.nextFloat();
      Color colorRandom = new Color(a, b, c, d);
        
      shapeLed.setLedColor(colorRandom.brighter());
        
    }

    // ejercicio 1 Añade un listener al control para que, al hacer click sobre el mismo, se detenga o empiece a parpadear.
    @FXML
    void stopLed(MouseEvent event) {

        if (shapeLed.isBlinking()) {
            shapeLed.setBlinking(false);
        } else {
            shapeLed.setBlinking(true);

        }

        event.consume();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
