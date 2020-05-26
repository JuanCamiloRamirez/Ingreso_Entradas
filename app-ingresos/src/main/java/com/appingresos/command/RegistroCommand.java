package com.appingresos.command;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



@Data
@Component
@NoArgsConstructor
public class RegistroCommand {

	private int idRegistro;
    private String documento;
    private String fechaEntrada;
    private String fechaSalida;
    private boolean finalizado;
	
}
