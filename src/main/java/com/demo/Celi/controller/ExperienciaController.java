
package com.demo.Celi.controller;

import com.demo.Celi.model.ExperienciaModel;
import com.demo.Celi.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired
    ExperienciaService expeServ;

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<ExperienciaModel>verExperiencia() {
        return expeServ.getExperiencia();
    }

    @PostMapping("/new/experiencia")
    public String agregarExperiencia(@RequestBody ExperienciaModel expe) {
        expeServ.saveExperiencia(expe);
        return "La Experiencia fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        expeServ.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    
    
}
