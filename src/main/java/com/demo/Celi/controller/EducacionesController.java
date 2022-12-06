
package com.demo.Celi.controller;

import com.demo.Celi.model.EducacionesModel;
import com.demo.Celi.service.EducacionesService;
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
public class EducacionesController {
    
    @Autowired
    EducacionesService educServ;

    @GetMapping("/ver/educaciones")
    @ResponseBody
    public List<EducacionesModel> verEducaciones() {
        return educServ.getEducaciones();
    }

    @PostMapping("/new/educaciones")
    public String agregarEducaciones(@RequestBody EducacionesModel educ) {
        educServ.getEducaciones();
        return "La nueva educación fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarEducaciones(@PathVariable Long id) {
        educServ.deleteEducaciones(id);
        return "El item educación indicado, fue borrado correctamente";
    }
}
