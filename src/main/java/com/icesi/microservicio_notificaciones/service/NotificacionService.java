package com.icesi.microservicio_notificaciones.service;

import com.icesi.microservicio_notificaciones.dto.NotificacionDTO;
import com.icesi.microservicio_notificaciones.model.Notificacion;
import com.icesi.microservicio_notificaciones.repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    public void enviarNotificacion(NotificacionDTO notificacion) {
        System.out.println("Enviando notificación a " + notificacion.getMemberId() + " con mensaje: " + notificacion.getMensaje());
        Notificacion notificacion_ = new Notificacion();
        notificacion_.setMensaje(notificacion.getMensaje());
        notificacion_.setEntrenadorID(notificacion_.getEntrenadorID());
        notificacion_.setMemberID(notificacion_.getMemberID());
        notificacionRepository.save(notificacion_);
    }
}
