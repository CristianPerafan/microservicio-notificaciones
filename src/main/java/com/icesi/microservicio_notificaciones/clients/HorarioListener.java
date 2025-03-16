package com.icesi.microservicio_notificaciones.clients;

import com.icesi.microservicio_notificaciones.config.RabbitMQConfig;
import com.icesi.microservicio_notificaciones.dto.CambioHorarioDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HorarioListener {
    @RabbitListener(queues = RabbitMQConfig.QUEUE_HORARIO)
    public void recibirCambiosHorario(CambioHorarioDTO cambioHorarioDTO) {
        System.out.println("Recibiendo cambios de horario: " + cambioHorarioDTO.getClaseId());
    }
}
