package com.ph.departamentos.Controllers;

import com.ph.departamentos.Entity.DepartamentoEntity;
import com.ph.departamentos.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    public DepartamentoService departamentoService;

    @PostMapping
    public DepartamentoEntity create(@RequestBody DepartamentoEntity departamentoEntity){
        return departamentoService.create(departamentoEntity);
    }

    @GetMapping
    public List<DepartamentoEntity> findAll(){
        return departamentoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentoEntity> findById(@PathVariable Long id){
        return departamentoService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        departamentoService.delete(id);
    }
}
