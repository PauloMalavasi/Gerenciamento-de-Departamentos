package com.ph.departamentos.Repository;

import com.ph.departamentos.Entity.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository <DepartamentoEntity, Long> {
}
