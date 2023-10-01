package test;

import java.sql.Connection;

import factory.ConnectionFactory;

public class TestPoolConexiones {
	
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 0; i < 20; i++) {
            Connection c = connectionFactory.realizarConexion();
            System.out.println("Abriendo la conexión número: " + (i + 1));
        }
    }

}
