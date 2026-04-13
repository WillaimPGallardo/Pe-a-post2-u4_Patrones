package com.universidad.notificaciones;

import com.universidad.notificaciones.modelo.Evento;
import com.universidad.notificaciones.observer.*;
import com.universidad.notificaciones.strategy.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class NotificacionesApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NotificacionesApp.class, args);
    }

    @Override
    public void run(String... args) {

        // OBSERVER
        Sujeto sistema = new Sujeto();
        sistema.suscribir(new Usuario("Juan"));
        sistema.suscribir(new Usuario("Ana"));

        sistema.notificar(new Evento("Pedido confirmado"));

        // STRATEGY
        ContextoNotificacion contexto = new ContextoNotificacion();

        contexto.setEstrategia(new EmailStrategy());
        contexto.enviar("Mensaje por email");

        contexto.setEstrategia(new SmsStrategy());
        contexto.enviar("Mensaje por SMS");
    }
}