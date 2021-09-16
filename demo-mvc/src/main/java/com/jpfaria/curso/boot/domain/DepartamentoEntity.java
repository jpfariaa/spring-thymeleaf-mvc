package com.jpfaria.curso.boot.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class DepartamentoEntity extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<CargoEntity> cargos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CargoEntity> getCargos() {
        return cargos;
    }

    public void setCargos(List<CargoEntity> cargos) {
        this.cargos = cargos;
    }
}
