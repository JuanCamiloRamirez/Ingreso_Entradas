package com.insoft.registro.repository;

import com.insoft.registro.entity.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository< RegistroEntity,Integer> {
    RegistroEntity findByDocumento(String documento);
}
