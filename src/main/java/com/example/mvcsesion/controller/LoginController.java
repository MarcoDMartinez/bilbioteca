package com.example.mvcsesion.controller;

import com.example.mvcsesion.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
             txtresultado.setText("bienvenido"+usuarionombre);

         }else{
             txtresultado.setText("datos incorrectos");
         }
    }
}

