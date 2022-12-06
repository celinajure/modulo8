
package com.demo.Celi.Repository;

import com.demo.Celi.model.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <PersonaModel, Long> {
    
}
