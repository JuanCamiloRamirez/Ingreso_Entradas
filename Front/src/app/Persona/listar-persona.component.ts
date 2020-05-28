import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { Persona } from '../Model/Persona/persona';
import { PersonaService } from '../Service/Persona/persona.service';

@Component({
  selector: 'app-listar-persona',
  templateUrl: './listar-persona.component.html',
  styleUrls: ['./listar-persona.component.css']
})
export class ListarPersonaComponent implements OnInit {

  persona: Persona =  new Persona(  );
  pageActual = 1;
  personas: Persona[];

  constructor(private service: PersonaService, private router: Router) { }

  ngOnInit(): void {
    this.service.getPersonas().subscribe(data => {
      this.personas = data;
    });
  }

  crearPersona(persona: Persona){
    this.service.crearPersona(persona)
    .subscribe(data => {
      Swal.fire(persona.nombre + '!' , 'El registro ha sido exitoso', 'success');
      this.limpiarCamposPersona(persona);
      this.ngOnInit();
    }, ( data => {
      Swal.fire('Hey usuario!', 'El documento ya se encuentra registrado.', 'warning');
    }));
  }

  limpiarCamposPersona(personaAGuardar: Persona){
    this.persona.nombre = '',
    this.persona.apellido = '',
    this.persona.tipoDocumento = '',
    this.persona.numeroDocumento = '',
    this.persona.cargo = '';
  }
}
