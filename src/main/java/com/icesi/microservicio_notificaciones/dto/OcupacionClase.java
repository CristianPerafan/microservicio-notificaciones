package com.icesi.microservicio_notificaciones.dto;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OcupacionClase implements Serializable {

    private String idClase;
    private int ocupacion;
}
