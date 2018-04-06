package com.cice;

import java.sql.Connection;

public class App
{
    public static void main( String[] args ){

        try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Generar conexion
            Connection

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
