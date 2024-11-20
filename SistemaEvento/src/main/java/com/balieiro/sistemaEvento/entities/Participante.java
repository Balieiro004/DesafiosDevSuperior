package com.balieiro.sistemaEvento.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @Column(unique = true)
    private String email;

    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",
                        joinColumns = @JoinColumn(name = "participante_id"),
                        inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> atividades = new HashSet<>();

}
