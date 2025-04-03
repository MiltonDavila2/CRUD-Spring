package com.crud.app.controlador;

import com.crud.app.servicio.TrabajadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabajadorControlador {

    @Autowired
    private TrabajadorServicio servicio;

    @GetMapping({"/trabajadores","/"})
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("trabajadores", servicio.ListarTrabajadores());
        return "trabajadores";
    }


}
