package com.universidad.notificaciones.strategy;

public class SmsStrategy implements EstrategiaNotificacion {

    public void enviar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}