package com.example.mvcsesion.controller;

import com.example.mvcsesion.model.UserModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AgregarLibrosController {
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtgenero;
    @FXML
    private Label txtresultado;

    private UserModel userModel = new UserModel();

    @FXML
    protected void onAgregarLibro(){
        String nombrelibro = txtnombre.getText();
        String genero =txtgenero.getText();
        if (nombrelibro.isEmpty() || genero.isEmpty()){
            txtresultado.setText("Rellena todos los campos");
            return;

        }
        if (!nombrelibro.isEmpty() && !genero.isEmpty()) {
            txtresultado.setText("Libro Agregado! "+nombrelibro);
        }
    }

    @FXML
    protected void onSalir(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/view/biblioteca.fxml"));
        try{
            Parent root = loader.load();
            Stage stage =new Stage();
            stage.setTitle("Menu Principal");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
