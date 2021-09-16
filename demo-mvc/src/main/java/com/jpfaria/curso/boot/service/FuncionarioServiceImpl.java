package com.jpfaria.curso.boot.service;

import com.jpfaria.curso.boot.dao.FuncionarioDAO;
import com.jpfaria.curso.boot.domain.FuncionarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    FuncionarioDAO dao;

    @Override @Transactional(readOnly = false)
    public void salvar(FuncionarioEntity funcionario) {
        dao.save(funcionario);
    }

    @Override @Transactional(readOnly = false)
    public void editar(FuncionarioEntity funcionario) {
        dao.update(funcionario);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public FuncionarioEntity buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<FuncionarioEntity> buscarTodos() {
        return dao.findAll();
    }
}
