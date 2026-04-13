package com.universidad.notificaciones.observer;

import com.universidad.notificaciones.modelo.Evento;

public interface Observador {
    void actualizar(Evento evento);
}