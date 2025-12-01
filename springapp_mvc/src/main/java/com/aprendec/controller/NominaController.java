package com.aprendec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aprendec.service.NominaService;
import com.aprendec.service.EmpleadoService;
import com.aprendec.model.Empleado;
import com.aprendec.model.Nomina;

@Controller
@RequestMapping("/nominas")
public class NominaController {

    @Autowired
    private NominaService nominaService;

    @Autowired
    private EmpleadoService empleadoService;

    // LISTAR NOMINAS
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", nominaService.listar());
        return "NominaListar";
    }

    // BUSCAR SUELDO POR DNI
    @GetMapping("/buscar")
    public String buscar(@RequestParam String dni, Model model) {

        Empleado empleado = empleadoService.obtenerPorDni(dni);
        Nomina nomina = nominaService.buscarPorDni(dni);

        int sueldo = (nomina != null) ? nomina.getSueldo() : -1;

        model.addAttribute("empleado", empleado);
        model.addAttribute("sueldo", sueldo);

        return "NominaListar";
    }
}
