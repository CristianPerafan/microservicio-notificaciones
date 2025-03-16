package com.icesi.microservicio_notificaciones.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Entity
@Getter
@Setter
public class Notificacion {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    private EntrenadorID entrenadorID;

    private MemberID memberID;

    @CreatedDate
    private LocalDateTime createdAt;

}
