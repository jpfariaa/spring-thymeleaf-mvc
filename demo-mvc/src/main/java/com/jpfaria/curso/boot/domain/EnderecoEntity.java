package com.jpfaria.curso.boot.domain;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECOS")
public class EnderecoEntity extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private UF uf;

}
