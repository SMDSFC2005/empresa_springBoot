package com.aprendec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aprendec.model.Empleado;
import com.aprendec.service.EmpleadoService;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    // LISTAR
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", empleadoService.listar());
        return "EmpleadoListar";
    }

    // FORM EDITAR
    @GetMapping("/editar/{dni}")
    public String editar(@PathVariable String dni, Model model) {
        model.addAttribute("empleado", empleadoService.obtenerPorDni(dni));
        return "Editar";
    }

    // GUARDAR EDICIÓN
    @PostMapping("/editar")
    public String guardar(@ModelAttribute Empleado empleado) {
        Empleado original = empleadoService.obtenerPorDni(empleado.getDni());

        original.setNombre(empleado.getNombre());
        original.setSexo(empleado.getSexo());
        original.setCategoria(empleado.getCategoria());
        original.setAnyos(empleado.getAnyos());

        empleadoService.guardar(original);

        return "redirect:/empleados";
    }
}
