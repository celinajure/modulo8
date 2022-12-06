
package com.demo.Celi.service;

import com.demo.Celi.Repository.IPersonaRepository;
import com.demo.Celi.model.PersonaModel;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService {
    
    @Autowired
   
      IPersonaRepository ipersonaRepository;

    
    public List<PersonaModel> getPersona() {
        List<PersonaModel>  listaPersonas = ipersonaRepository.findAll();
        return listaPersonas;
    }

   
    public void savePersona(PersonaModel per) {
        ipersonaRepository.save(per);
   }

    
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
  }

  
    public PersonaModel findPersona(Long id) {
          PersonaModel  perso = ipersonaRepository.findById(id).orElse(null);
          return perso;
   }
    
    
    
}
