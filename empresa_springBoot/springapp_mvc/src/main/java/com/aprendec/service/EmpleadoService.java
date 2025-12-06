package com.aprendec.service;

import com.aprendec.model.Empleado;
import com.aprendec.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> listar() {
        return empleadoRepository.findAll();
    }

    public Empleado obtenerPorDni(String dni) {
        return empleadoRepository.findByDni(dni);
    }

    public Empleado guardar(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
