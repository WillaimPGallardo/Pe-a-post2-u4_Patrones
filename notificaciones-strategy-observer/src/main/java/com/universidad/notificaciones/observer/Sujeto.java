package com.universidad.notificaciones.observer;

import com.universidad.notificaciones.modelo.Evento;
import java.util.ArrayList;
import java.util.List;

public class Sujeto {

    private final List<Observador> observadores = new ArrayList<>();

    public void suscribir(Observador o) {
        observadores.add(o);
    }

    public void notificar(Evento evento) {
        for (Observador o : observadores) {
            o.actualizar(evento);
        }
    }
}