package com.jpfaria.curso.boot.dao;

import java.util.List;

import com.jpfaria.curso.boot.domain.DepartamentoEntity;

public interface DepartamentoDAO {

    void save(DepartamentoEntity departamento);

    void update(DepartamentoEntity departamento);

    void delete(Long id);

    DepartamentoEntity findById(Long id);

    List<DepartamentoEntity> findAll();
}
