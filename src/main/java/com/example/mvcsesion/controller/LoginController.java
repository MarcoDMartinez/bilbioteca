package com.example.mvcsesion.controller;

import com.example.mvcsesion.model.UserModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField txtuser;
    @FXML
    private TextField txtpassword;
    @FXML
    private Label txtresultado;

    private  UserModel userModel = new UserModel();

    @FXML
    protected void onHelloButtonClick(){
        String usuarionombre = txtuser.getText();
        String password =txtpassword.getText();
         if (usuarionombre.isEmpty() || password.isEmpty()){
             txtresultado.setText("llean todos los campos");
             return;

         }
         boolean valido = userModel.validarusuario(usuarionombre, password);
         if (valido) {
             txtresultado.setText("Bienvenido "+usuarionombre);
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

         }else{
             txtresultado.setText("datos incorrectos");
         }
    }
}

