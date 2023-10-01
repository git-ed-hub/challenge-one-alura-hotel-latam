package util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class ConvertirFecha {
    public static LocalDate convertirDateALocalDate(java.util.Date fechaNacimiento) {
        return fechaNacimiento.toInstant().atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}
