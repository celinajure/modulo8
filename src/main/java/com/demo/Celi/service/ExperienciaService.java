
package com.demo.Celi.service;

import com.demo.Celi.Repository.IExperienciaRepository;
import com.demo.Celi.model.ExperienciaModel;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
 
    @Autowired
    IExperienciaRepository iexperienciaRepository;
    
    public List<ExperienciaModel> getExperiencia() {
        List<ExperienciaModel>  listaExperiencias = iexperienciaRepository.findAll();
        return listaExperiencias;
    }

   
    public void saveExperiencia(ExperienciaModel expe) {
        iexperienciaRepository.save(expe);
   }

    
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
  }

  
    public ExperienciaModel findExperiencia(Long id) {
          ExperienciaModel  expe = iexperienciaRepository.findById(id).orElse(null);
          return expe;
   }

}
