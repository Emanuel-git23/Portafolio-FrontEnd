package com.porfolio.egfap.Repository;

import com.porfolio.egfap.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
        
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
