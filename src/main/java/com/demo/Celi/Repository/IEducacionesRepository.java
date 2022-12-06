
package com.demo.Celi.Repository;

import com.demo.Celi.model.EducacionesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducacionesRepository extends JpaRepository <EducacionesModel, Long>{
    
}
