package com.universidad.notificaciones.strategy;

public class EmailStrategy implements EstrategiaNotificacion {

    public void enviar(String mensaje) {
        System.out.println("EMAIL: " + mensaje);
    }
}