package com.example.api2.Utilidades;

public class Utilidades {
    //constantes campos de tabla Token y Code
    public static final String tabla_token="user_token_name";
    public static final String userTokenCode="user_token_code";
    public static final String tokenCode="token_code";


    //Relacion con activity agregar
    public static final String CREAR_TABLA_TOKEN="CREATE TABLE "+tabla_token+" (USER_TOKEN_NAME TEXT(30) PRIMARY KEY NOT NULL )";

    //Relacion con activity generar
    public static final String CREAR_TABLA_CODE="CREATE TABLE "+userTokenCode+" (TOKEN_NAME_ID TEXT(30) REFERENCES USER_TOKEN_NAME, "+tokenCode+"(64))";
}
