package com.universidad.notificaciones.observer;

import com.universidad.notificaciones.modelo.Evento;

public class Usuario implements Observador {

    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Evento evento) {
        System.out.println(nombre + " recibió: " + evento.getMensaje());
    }
}