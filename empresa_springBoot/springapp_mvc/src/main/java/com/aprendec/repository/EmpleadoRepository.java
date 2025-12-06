package com.aprendec.repository;

import com.aprendec.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

    Empleado findByDni(String dni);
}
