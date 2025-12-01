package com.aprendec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aprendec.model.Nomina;

public interface NominaRepository extends JpaRepository<Nomina, Integer> {

    // Buscar nomina por DNI del empleado
    Nomina findByDniEmpleado(String dniEmpleado);
}
