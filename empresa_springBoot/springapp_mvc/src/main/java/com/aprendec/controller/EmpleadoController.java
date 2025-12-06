package com.aprendec.controller;

import com.aprendec.model.Empleado;
import com.aprendec.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public String manejarGet(@RequestParam(name = "opcion", required = false) String opcion,
                             @RequestParam(name = "dni", required = false) String dni,
                             Model model) {

        if (opcion == null || opcion.equals("listar")) {
            model.addAttribute("lista", empleadoService.listar());
            return "EmpleadoListar";
        }

        if ("editar".equals(opcion) && dni != null) {
            Empleado empleado = empleadoService.obtenerPorDni(dni);
            model.addAttribute("empleado", empleado);
            return "Editar";
        }

        model.addAttribute("lista", empleadoService.listar());
        return "EmpleadoListar";
    }

    @PostMapping
    public String manejarPost(@RequestParam("opcion") String opcion,
                              @RequestParam("dni") String dni,
                              @RequestParam("nombre") String nombre,
                              @RequestParam("sexo") char sexo,
                              @RequestParam("categoria") int categoria,
                              @RequestParam("anyos") int anyos) {

        if ("editar".equals(opcion)) {
            Empleado empleado = empleadoService.obtenerPorDni(dni);
            if (empleado != null) {
                empleado.setNombre(nombre);
                empleado.setSexo(sexo);
                empleado.setCategoria(categoria);
                empleado.setAnyos(anyos);
                empleadoService.guardar(empleado);
            }
        }

        return "redirect:/";
    }
}
