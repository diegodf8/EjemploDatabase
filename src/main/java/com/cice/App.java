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

            // Especificar la peticion: CREATE TABLE
            //String sql ="CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL, PRIMARY KEY (id))";

            // INSERT
            //String sql ="INSERT INTO prueba (nombre) VALUES('Test2')";
            //String sql ="INSERT INTO prueba (id,nombre) VALUES(NULL,'Test3')";

            //UPDATE
            //String sql ="UPDATE prueba SET nombre='Upoddss' WHERE id=3 AND nombre='Xas'";

            //DELETE
            String sql ="DELETE FROM prueba where id=2";

            // Ejecutar la peticion (executeUpdate) contra la bbdd  para INSERT, CREATE, DELETE & UPDATE
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
