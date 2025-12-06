package com.aprendec.repository;

import com.aprendec.model.Nomina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NominaRepository extends JpaRepository<Nomina, Integer> {

    Nomina findByDniEmpleado(String dniEmpleado);
}
