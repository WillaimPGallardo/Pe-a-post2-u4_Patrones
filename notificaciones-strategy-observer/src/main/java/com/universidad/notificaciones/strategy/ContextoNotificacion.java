package com.universidad.notificaciones.strategy;

public class ContextoNotificacion {

    private EstrategiaNotificacion estrategia;

    public void setEstrategia(EstrategiaNotificacion estrategia) {
        this.estrategia = estrategia;
    }

    public void enviar(String mensaje) {
        estrategia.enviar(mensaje);
    }
}