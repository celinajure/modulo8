
package com.demo.Celi.service;

import com.demo.Celi.Repository.IEducacionesRepository;
import com.demo.Celi.model.EducacionesModel;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionesService {
    
    @Autowired
    IEducacionesRepository ieducacionesRepository;
    
    public List<EducacionesModel> getEducaciones() {
        List<EducacionesModel>  listaEducaciones = ieducacionesRepository.findAll();
        return listaEducaciones;
    }

   
    public void saveEducaciones(EducacionesModel edu) {
        ieducacionesRepository.save(edu);
   }

    
    public void deleteEducaciones(Long id) {
        ieducacionesRepository.deleteById(id);
  }

  
    public EducacionesModel findExperiencia(Long id) {
         EducacionesModel  educ = ieducacionesRepository.findById(id).orElse(null);
          return educ;
   }
    
    
}
