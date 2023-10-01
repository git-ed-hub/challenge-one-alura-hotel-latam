package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.swing.JOptionPane;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import views.MenuPrincipal;

public class ConnectionFactory {
	
    private final DataSource dataSource;

    /**
     * Creando el pool de conexiones en el constructor de la clase, haciendo uso
     * de la libreria c3p0.
     */
    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/alura_hotel/:3306");
        comboPooledDataSource.setUser("admin");
        comboPooledDataSource.setPassword("root");
        comboPooledDataSource.setMaxPoolSize(10);
        this.dataSource = comboPooledDataSource;
    }

    /**
     * Obteniendo la conexión por medio del método getConnection(), de la
     * interfaz DataSource.
     *
     * @return Devuelve el estatus de la conexión al recurso de datos.
     */
    public Connection realizarConexion() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al conectar con la Base de Datos de MySQL, inténtelo "
                    + "más tarde.",
                    "Error en la conexión :(",
                    JOptionPane.ERROR_MESSAGE
            );
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            throw new RuntimeException(e);
        }
    }

}
