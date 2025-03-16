package com.icesi.microservicio_notificaciones.clients;

import com.icesi.microservicio_notificaciones.config.RabbitMQConfig;
import com.icesi.microservicio_notificaciones.dto.NotificacionDTO;
import com.icesi.microservicio_notificaciones.service.NotificacionService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionListener {

    @Autowired
    private NotificacionService notificacionService;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_INSCRIPCION)
    public void recibirNotificacion(NotificacionDTO inscripcionDTO) {
        System.out.println("Recibiendo notificación de inscripción: " + inscripcionDTO.getMemberId());
        notificacionService.enviarNotificacion(inscripcionDTO);
    }
}
