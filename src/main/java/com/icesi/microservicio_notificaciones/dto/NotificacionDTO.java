package com.icesi.microservicio_notificaciones.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class NotificacionDTO implements Serializable {
    private Long entrenadorId;
    private Long memberId;
    private String mensaje;
}
