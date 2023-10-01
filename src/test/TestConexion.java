package test;

import java.sql.Connection;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TestConexion {
	
    public static void main(String[] args) {
        try(Connection c = new ConnectionFactory().realizarConexion();){
            System.out.println(c);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
