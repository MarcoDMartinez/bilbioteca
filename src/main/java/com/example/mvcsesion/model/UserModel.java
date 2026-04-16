package com.example.mvcsesion.model;

public class UserModel {
    private final String USUARIO_CORRECTO = "usuariolibros";
    private final String USUARIO_PASSWORD = "usuario123";

    public boolean validarusuario(String usuarionombre, String password){

        return  usuarionombre.equals(USUARIO_CORRECTO) &&  password.equals(USUARIO_PASSWORD);

    }

}
