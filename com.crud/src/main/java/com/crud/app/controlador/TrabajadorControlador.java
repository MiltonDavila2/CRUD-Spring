package com.crud.app.controlador;

import com.crud.app.modelo.Trabajador;
import com.crud.app.servicio.TrabajadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrabajadorControlador {

    @Autowired
    private TrabajadorServicio servicio;

    @GetMapping({"/trabajadores","/"})
    public String listarTrabajadores(Model modelo){
        modelo.addAttribute("trabajadores", servicio.ListarTrabajadores());
        return "trabajadores";
    }


    @GetMapping("/trabajadores/nuevo")
    public String CrearTrabajadorFormulario(Model modelo){
        Trabajador trabajador = new Trabajador();
        modelo.addAttribute("trabajador",trabajador);
        return "crear_trabajador";

    }

    @PostMapping("/trabajadores")
    public String GuardarTrabajador(@ModelAttribute("trabajador") Trabajador trabajador){
        servicio.GuardarTrabajador(trabajador);
        return "redirect:/trabajadores";
    }

}
