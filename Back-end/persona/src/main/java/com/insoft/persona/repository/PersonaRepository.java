package com.insoft.persona.repository;

import com.insoft.persona.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository< PersonaEntity, Integer > {
    PersonaEntity findByNumeroDocumento (String numeroDocumento);
}
