package com.appingresos.command;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@Component
@NoArgsConstructor
public class RegistroCommand {

	private int idRegistro;
    private String documento;
    private Date fechaEntrada;
    private Date fechaSalida;
	
}
