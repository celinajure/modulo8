
package com.demo.Celi.Repository;

import com.demo.Celi.model.ExperienciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<ExperienciaModel, Long>{
    
    
}
    

