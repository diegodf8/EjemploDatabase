package com.cice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App
{
    public static void main( String[] args ){

        try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Generar conexion con mysql
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/pruebadb","root","root");

            // Sentencia para atacar a la base de datos
            Statement statement = connection.createStatement();

            // Especificar la peticion
            String sql ="CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL, PRIMARY KEY (id))";

            // Ejecutar la peticion contra la bbdd
            statement.executeUpdate(sql);

            // Cerrar recursos
            connection.close();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
