package com.aprendec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendec.model.Empleado;
import com.aprendec.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepo;

    public List<Empleado> listar() {
        return empleadoRepo.findAll();
    }

    public Empleado obtenerPorDni(String dni) {
        return empleadoRepo.findByDni(dni);
    }

    public void guardar(Empleado empleado) {
        empleadoRepo.save(empleado);
    }
}
