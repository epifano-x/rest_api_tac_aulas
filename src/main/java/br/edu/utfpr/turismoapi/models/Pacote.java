package br.edu.utfpr.turismoapi.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Pacote extends BaseEntity {

    @OneToMany(mappedBy = "pacote", cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();

}
