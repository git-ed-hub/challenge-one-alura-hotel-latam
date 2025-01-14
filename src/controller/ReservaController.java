package controller;

import java.sql.Date;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaController {
	
    private final ReservaDAO reservaDAO;

    /**
     * Creando conexion para operaciones con MySQL con la tabla de reservas.
     */
    public ReservaController() {
        this.reservaDAO = new ReservaDAO(new ConnectionFactory().realizarConexion());
    }

    /**
     * Obteniendo el listado del DAO de huespedes.
     *
     * @return - List de reservas existentes.
     */
    public List<Reserva> listar() {
        return reservaDAO.listar();
    }

    /**
     * Permite consultar las reservas acorde al idReserva.
     *
     * @param idReserva - Clave de la reserva para tomar referencia del
     * registro.
     * @return - Lista de reservas según el idReserva.
     */
    public List<Reserva> listar(String idReserva) {
        return reservaDAO.listar(idReserva);
    }

    /**
     * Almacenando la información obtenida del View, en la capa DAO.
     *
     * @param reserva - Objeto de tipo reserva.
     */
    public void guardar(Reserva reserva) {
        reservaDAO.guardar(reserva);
    }

    /**
     * Recopila los datos de la reserva del modelo View.
     *
     * @param idReserva - Clave de la reserva para tomar referencia del
     * registro.
     * @param fechaEntrada - Fecha de entrada del húesped.
     * @param fechaSalida - Fecha de salida del húesped.
     * @param valorReserva - Valor monetario de la reserva.
     * @param formaPago - Forma de pago del húesped.
     * @return - Retrora el número de registros actualizados.
     */
    public int actualizar(String idReserva, Date fechaEntrada,
            Date fechaSalida, double valorReserva, String formaPago) {
        return reservaDAO.actualizar(idReserva, fechaEntrada, fechaSalida, valorReserva, formaPago);
    }

}
