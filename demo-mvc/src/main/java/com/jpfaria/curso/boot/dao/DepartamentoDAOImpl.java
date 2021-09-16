package com.jpfaria.curso.boot.dao;

import com.jpfaria.curso.boot.domain.DepartamentoEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDAOImpl extends AbstractDAO<DepartamentoEntity, Long> implements DepartamentoDAO {

}
