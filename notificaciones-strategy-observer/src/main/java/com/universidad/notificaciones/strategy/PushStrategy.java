package com.universidad.notificaciones.strategy;

public class PushStrategy implements EstrategiaNotificacion {

    public void enviar(String mensaje) {
        System.out.println("PUSH: " + mensaje);
    }
}