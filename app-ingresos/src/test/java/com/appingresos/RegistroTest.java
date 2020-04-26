package com.appingresos;

import com.appingresos.model.Registro;
import com.appingresos.model.businessException.BusinessException;
import com.appingresos.model.util.DateUtil;
import com.appingresos.model.util.Validator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistroTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void crearRegistroConDocumentoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Registro.DOCUMENTO_REQUERIDO);
        Registro registro = new Registro.RegistroBuilder()
                .build();
    }

    @Test
    public void crearRegistroConDocumentoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Registro.DOCUMENTO_REQUERIDO);
        Registro registro = new Registro.RegistroBuilder()
                .setDocumento("")
                .build();
    }

    @Test
    public void crearRegistroSinFechaEntrada() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Registro.FECHA_ENTRADA_REQUERIDA);
        Registro registro = new Registro.RegistroBuilder()
                .setIdRegistro(1)
                .setDocumento("1036405066")
                .build();
    }

    @Test
    public void crearRegistroSinFechaSalida() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Registro.FECHA_SALIDA_REQUERIDA);
        Registro registro = new Registro.RegistroBuilder()
                .setIdRegistro(2)
                .setDocumento("1036405066")
                .setFechaEntrada(new Date())
                .build();
    }

    @Test
    public void calcularHorasLaboradas() throws BusinessException {
        Date fechaEntrada = DateUtil.convertStringToDate("2020-02-18 07:00:00");
        Date fechaSalida = DateUtil.convertStringToDate("2020-02-18 09:00:00");
        Registro registro = new Registro.RegistroBuilder()
                .setIdRegistro(3)
                .setDocumento("1036405066")
                .setFechaEntrada(fechaEntrada)
                .setFechaSalida(fechaSalida)
                .build();
        double valorReal = registro.calcularHorasLaboradas();
        double valorEsperado= 2;
        Assert.assertEquals(valorEsperado,valorReal,0);
    }
}
