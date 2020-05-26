import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Registro } from 'src/app/Model/registro';

@Injectable({
  providedIn: 'root'
})
export class RegistroService {

  constructor(private http: HttpClient) { }
  getRegistros(){
    return this.http.get<Registro[]>('http://localhost:8080/registro/v1/listado-registros');
  }
  crearRegistro(documento: string){
    return this.http.post<string>('http://localhost:8080/registro/registrar?documento=' + documento, documento);
  }

}









