package com.aprendec.controller;

import com.aprendec.model.Nomina;
import com.aprendec.service.NominaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nominas")
public class NominaController {

    private final NominaService nominaService;

    public NominaController(NominaService nominaService) {
        this.nominaService = nominaService;
    }

    @GetMapping
    public String manejarGet(@RequestParam(name = "opcion", required = false) String opcion,
                             @RequestParam(name = "dni", required = false) String dni,
                             Model model) {

        if ("listar".equals(opcion)) {
            model.addAttribute("lista", nominaService.listar());
        }

        if ("buscarSueldo".equals(opcion) && dni != null) {
            Nomina nomina = nominaService.buscarPorDni(dni);
            int sueldo = (nomina != null) ? nomina.getSueldo() : -1;
            model.addAttribute("dniEmpleado", dni);
            model.addAttribute("sueldo", sueldo);
        }

        return "NominaListar";
    }

    @PostMapping
    public String manejarPost(@RequestParam(name = "opcion", required = false) String opcion,
                              @RequestParam(name = "dni", required = false) String dni,
                              Model model) {
        return manejarGet(opcion, dni, model);
    }
}
