package com.universidad.notificaciones.modelo;

public class Evento {

    private final String mensaje;

    public Evento(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}