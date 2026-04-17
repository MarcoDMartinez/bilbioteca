package com.example.mvcsesion.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class BibliotecaController {

    public void onSalir(){

    }

    public void onAgregar(){


        FXMLLoader loader = new FXMLLoader(getClass().getResource("agregar.fxml"));
        try{
            Parent root = loader.load();
            Stage stage =new Stage();
            stage.setTitle("segunda ventana");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void onMisLibros(){

    }

}
