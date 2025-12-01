package com.aprendec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendec.model.Nomina;
import com.aprendec.repository.NominaRepository;

@Service
public class NominaService {

    @Autowired
    private NominaRepository nominaRepo;

    public List<Nomina> listar() {
        return nominaRepo.findAll();
    }

    public Nomina buscarPorDni(String dni) {
        return nominaRepo.findByDniEmpleado(dni);
    }

    public void guardar(Nomina nomina) {
        nominaRepo.save(nomina);
    }
}
