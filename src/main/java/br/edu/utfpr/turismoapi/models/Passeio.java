package br.edu.utfpr.turismoapi.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_passeio")
public class Passeio {
    @Id
    @Column(name = "Id", nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "Destino", length = 150, nullable = false)
    private String destino;

    @Column(name = "Itinerario", length = 250)
    private String itinerario;

    @Column(name = "Preco", nullable = false)
    private double preco;

    @CreationTimestamp
    @Column(name = "CreatedAt", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

}
