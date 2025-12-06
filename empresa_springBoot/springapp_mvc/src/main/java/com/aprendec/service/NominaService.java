package com.aprendec.service;

import com.aprendec.model.Nomina;
import com.aprendec.repository.NominaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NominaService {

    private final NominaRepository nominaRepository;

    public NominaService(NominaRepository nominaRepository) {
        this.nominaRepository = nominaRepository;
    }

    public List<Nomina> listar() {
        return nominaRepository.findAll();
    }

    public Nomina buscarPorDni(String dniEmpleado) {
        return nominaRepository.findByDniEmpleado(dniEmpleado);
    }

    public Nomina guardar(Nomina nomina) {
        return nominaRepository.save(nomina);
    }
}
