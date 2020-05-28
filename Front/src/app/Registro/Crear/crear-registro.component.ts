import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Registro } from '../../Model/Registro/registro';
import { RegistroService } from '../../Service/Registro/registro.service';
import { PersonaService } from '../../Service/Persona/persona.service';

@Component({
  selector: 'app-crear-registro',
  templateUrl: './crear-registro.component.html',
  styleUrls: ['./crear-registro.component.css']
})
export class CrearRegistroComponent implements OnInit {

  personaIngresando: string;
  registro: Registro = new Registro();

  constructor(
    private service: RegistroService,
    private personaService: PersonaService,
    private router: Router) { }

  ngOnInit() {
    this.Reloj();
   }

  crearRegistro(registro: Registro){
    this.service.crearRegistro(registro.documento)
    .subscribe(data => {
      registro.documento = data;
    });
    this.getPersonaPorDocumento(registro.documento);
  }

  getPersonaPorDocumento(documento){
    this.personaService.getPersonaPorDocumento(documento).subscribe(
      data => {
        this.personaIngresando = data.nombre + ' ' + data.apellido;
      });
  }



    Reloj() {
    const tiempo = new Date();
    const hora = tiempo.getHours();
    const minuto = tiempo.getMinutes();
    const segundo = tiempo.getSeconds();
    document.getElementById('hora').innerHTML = hora.toString();
    document.getElementById('minuto').innerHTML = minuto.toString();
    document.getElementById('segundo').innerHTML = segundo.toString();
    setTimeout('Reloj()', 1000);
    const strHora = hora.toString();
    if (strHora.length === 1) {
                document.getElementById('hora').innerHTML = '0' + hora.toString();
            }
    const strMinuto = minuto.toString();
    if (strMinuto.length === 1) {
                document.getElementById('minuto').innerHTML = '0' + minuto.toString();
            }
    const strSegundo = segundo.toString();
    if (strSegundo.length === 1) {
                document.getElementById('segundo').innerHTML = '0' + segundo.toString();
            }
  }

}
