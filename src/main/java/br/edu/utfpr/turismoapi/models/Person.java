package br.edu.utfpr.turismoapi.models;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// @Data //All together now: A shortcut for @ToString, @EqualsAndHashCode,
// @Getter on all fields, and @Setter on all non-final fields, and
// @RequiredArgsConstructor!
@Entity
@Table(name = "tb_person")

public class Person {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "Nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "Email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "Nascimento")
    private LocalDateTime nascimento;

}
