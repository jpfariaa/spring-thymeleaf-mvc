package com.jpfaria.curso.boot.dao;

import java.util.List;

import com.jpfaria.curso.boot.domain.CargoEntity;

public interface CargoDAO {

    void save(CargoEntity cargo );

    void update(CargoEntity cargo);

    void delete(Long id);

    CargoEntity findById(Long id);

    List<CargoEntity> findAll();
}
