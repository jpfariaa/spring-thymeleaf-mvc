package com.jpfaria.curso.boot.service;

import com.jpfaria.curso.boot.domain.DepartamentoEntity;

import java.util.List;

public interface DepartamentoService {
    void salvar(DepartamentoEntity cargo);

    void editar(DepartamentoEntity cargo);

    void excluir(Long id);

    DepartamentoEntity buscarPorId(Long id);

    List<DepartamentoEntity> buscarTodos();
}
