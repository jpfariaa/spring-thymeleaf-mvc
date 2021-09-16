package com.jpfaria.curso.boot.domain;

import javax.persistence.*;

@Entity
@Table(name = "CARGOS")
public class CargoEntity extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private DepartamentoEntity departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
