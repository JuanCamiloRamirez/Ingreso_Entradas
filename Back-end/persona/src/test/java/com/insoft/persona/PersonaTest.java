package com.insoft.persona;

import com.insoft.persona.model.Persona;
import com.insoft.persona.model.businessexception.BusinessException;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void crearPersonaConTipoDocumentoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.TIPO_DOCUMENTO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .build();
    }

    @Test
    public void crearPersonaConTipoDocumentoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.TIPO_DOCUMENTO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setTipoDocumento("")
                .build();
    }

    @Test
    public void crearPersonaConTipoDocumentoInvalido() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.TIPO_DOCUMENTO_INVALIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setTipoDocumento("TI")
                .build();
    }

    @Test
    public void crearPersonaConDocumentoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.NUMERO_DOCUMENTO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(1)
                .setTipoDocumento("CC")
                .build();
    }

    @Test
    public void crearPersonaConDocumentoVacio() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.NUMERO_DOCUMENTO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(2)
                .setTipoDocumento("CC")
                .setNumeroDocumento("")
                .build();
    }

    @Test
    public void crearPersonaConNombreNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.NOMBRE_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(3)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .build();
    }

    @Test
    public void crearPersonaConNombreVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.NOMBRE_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(3)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("")
                .build();
    }

    @Test
    public void crearPersonaConApellidoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.APELLIDO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(4)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .build();
    }

    @Test
    public void crearPersonaConApellidoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.APELLIDO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(5)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("")
                .build();
    }

    @Test
    public void crearPersonaConCargooNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.CARGO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(6)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("Quintero")
                .build();
    }

    @Test
    public void crearPersonaConCargoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Persona.CARGO_REQUERIDO);
        Persona persona = new Persona.PersonaBuilder()
                .setIdPersona(7)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("Quintero")
                .setCargo("")
                .build();
    }

}
