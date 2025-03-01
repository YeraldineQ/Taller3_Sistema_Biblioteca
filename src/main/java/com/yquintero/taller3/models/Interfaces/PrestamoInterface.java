package com.yquintero.taller3.models.Interfaces;

import com.yquintero.taller3.models.Libro;
import com.yquintero.taller3.models.Usuario;

public interface PrestamoInterface {
    Long getId();

    Libro getIdLibro();

    Usuario getUsuario();

    String getFechaPrestamo();

    String getFechaDevolucion();
}
