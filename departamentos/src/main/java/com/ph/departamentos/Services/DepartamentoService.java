package com.ph.departamentos.Services;

import com.ph.departamentos.Entity.DepartamentoEntity;
import com.ph.departamentos.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    public DepartamentoRepository departamentoRepository;

    public List<DepartamentoEntity> findAll(){
        return departamentoRepository.findAll();
    }

    public DepartamentoEntity create(DepartamentoEntity departamentoEntity){
        return departamentoRepository.save(departamentoEntity);
    }

    public void delete(Long id){
        departamentoRepository.deleteById(id);
    }

    public Optional<DepartamentoEntity> findId(Long id){
        return departamentoRepository.findById(id);
    }
}

