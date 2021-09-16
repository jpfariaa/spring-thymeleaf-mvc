package com.jpfaria.curso.boot.service;

import com.jpfaria.curso.boot.domain.CargoEntity;

import java.util.List;

public interface CargoService {

    void salvar(CargoEntity cargo);

    void editar(CargoEntity cargo);

    void excluir(Long id);

    CargoEntity buscarPorId(Long id);

    List<CargoEntity> buscarTodos();
}
