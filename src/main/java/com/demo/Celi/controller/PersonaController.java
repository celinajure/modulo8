
package com.demo.Celi.controller;

import com.demo.Celi.model.PersonaModel;
import com.demo.Celi.service.PersonaService;
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
public class PersonaController {
    @Autowired
    PersonaService persoServ;

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<PersonaModel> verPersonas() {
        return persoServ.getPersona();
    }

    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody PersonaModel pers) {
        persoServ.savePersona(pers);
        return "La persona fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
}
