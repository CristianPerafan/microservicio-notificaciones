package com.icesi.microservicio_notificaciones.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {


    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TRAINER')")
    public String notificacion() {
        System.out.println("Notificación enviada");
        return "Este es un recurso protegido";
    }

    @GetMapping("/public")
    public String publico() {
        return "Este es un recurso público";
    }

}
