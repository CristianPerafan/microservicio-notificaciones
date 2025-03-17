package com.icesi.microservicio_notificaciones.consumers;

import com.icesi.microservicio_notificaciones.dto.OcupacionClase;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OcupacionClasesConsumer {
    @KafkaListener(topics = "ocupacion.clases", groupId = "clases-ocupacion-monitoreo")
    public void consumirMensaje(String message) {
        System.out.println("Recibiendo mensaje de ocupación de clase: " + message);
    }
}
