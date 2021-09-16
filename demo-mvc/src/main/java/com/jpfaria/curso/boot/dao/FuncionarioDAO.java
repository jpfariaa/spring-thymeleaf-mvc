package com.jpfaria.curso.boot.dao;

import java.util.List;

import com.jpfaria.curso.boot.domain.FuncionarioEntity;

public interface FuncionarioDAO {

    void save(FuncionarioEntity funcionario);

    void update(FuncionarioEntity funcionario);

    void delete(Long id);

    FuncionarioEntity findById(Long id);

    List<FuncionarioEntity> findAll();
}
