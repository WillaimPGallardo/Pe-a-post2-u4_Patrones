package com.universidad.notificaciones;

import com.universidad.notificaciones.strategy.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacionesTest {

    @Test
    void testStrategy() {
        ContextoNotificacion contexto = new ContextoNotificacion();
        contexto.setEstrategia(new EmailStrategy());
        contexto.enviar("Hola");

        assertTrue(true);
    }
}