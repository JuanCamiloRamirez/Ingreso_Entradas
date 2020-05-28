package com.insoft.registro.restclient;

import com.insoft.registro.dto.PersonaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "servicio.personas", url="localhost:8081/persona")
public interface PersonaRestClient {

    @GetMapping("/listado-personas")
    List<PersonaDTO> findAll();

    @PostMapping("/registro-persona")
    void registrarPersona(PersonaDTO personaDTO);

    @GetMapping("/buscar-documento")
    PersonaDTO encontrarPorDocumento(String documento);
}
