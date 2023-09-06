package br.edu.utfpr.turismoapi.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @Column(name = "Id", nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "Nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "Email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "Nascimento")
    private LocalDateTime nascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "Perfil", length = 20, nullable = false)
    private Perfil perfil;

    @CreationTimestamp
    @Column(name = "CreatedAt", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

    public enum Perfil {
        CLIENTE, AGENCIA_DE_VIAGENS
    }
}
