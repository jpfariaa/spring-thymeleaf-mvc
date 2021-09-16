package com.jpfaria.curso.boot.dao;

import com.jpfaria.curso.boot.domain.FuncionarioEntity;
import org.springframework.stereotype.Repository;


@Repository
public class FuncionarioDAOImpl extends AbstractDao<FuncionarioEntity, Long> implements FuncionarioDAO {

}
