package com.jpfaria.curso.boot.service;

import com.jpfaria.curso.boot.dao.DepartamentoDAO;
import com.jpfaria.curso.boot.domain.DepartamentoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {
    
    @Autowired
    private DepartamentoDAO dao;

    @Override
    public void salvar(DepartamentoEntity departamento) {
        dao.save(departamento);
    }

    @Override
    public void editar(DepartamentoEntity departamento) {
        dao.update(departamento);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = false)
    @Override
    public DepartamentoEntity buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = false)
    @Override
    public List<DepartamentoEntity> buscarTodos() {
        return dao.findAll();
    }
}
