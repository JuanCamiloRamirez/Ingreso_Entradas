import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../../Model/Persona/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService 
{

  constructor(private http: HttpClient) { }
  getPersonas(){
    return this.http.get<Persona[]>('http://localhost:8081/persona/listado-personas');
  }
  crearPersona(persona: Persona){
    var json = { idPersona: persona.idPersona,
                  nombre: persona.nombre,
                  apellido: persona.apellido,
                  tipoDocumento: persona.tipoDocumento,
                  numeroDocumento: persona.numeroDocumento,
                  cargo: persona.cargo
                };
    return this.http.post<JSON>('http://localhost:8081/persona/registro-persona', json);
  }
  getPersonaPorDocumento(documento: string){
    return this.http.get<Persona>('http://localhost:8081/persona/buscar-documento?documento=' + documento);
  }
}
