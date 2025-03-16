package com.icesi.microservicio_notificaciones.repository;

import com.icesi.microservicio_notificaciones.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}

