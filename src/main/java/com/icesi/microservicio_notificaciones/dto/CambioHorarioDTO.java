package com.icesi.microservicio_notificaciones.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class CambioHorarioDTO implements Serializable {
    private LocalDateTime nuevoHorario;
    private Long claseId;
}