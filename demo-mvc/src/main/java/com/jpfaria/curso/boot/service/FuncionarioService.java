package com.jpfaria.curso.boot.service;

import com.jpfaria.curso.boot.domain.FuncionarioEntity;

import java.util.List;

public interface FuncionarioService {
    void salvar(FuncionarioEntity funcionario);

    void editar(FuncionarioEntity funcionario);

    void excluir(Long id);

    FuncionarioEntity buscarPorId(Long id);

    List<FuncionarioEntity> buscarTodos();
}
