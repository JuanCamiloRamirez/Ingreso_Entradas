package com.appingresos.repository;

import com.appingresos.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <PersonaEntity, Integer > {
    PersonaEntity findByNumeroDocumento (String numeroDocumento);
}
