import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { RegistroService } from '../../Service/Registro/registro.service';
import { Registro } from 'src/app/Model/registro';

@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {

  registro: Registro = new Registro();

  constructor(private service: RegistroService, private router: Router) { }

  ngOnInit() {
  }

  crearRegistro2(registro: Registro){
    this.service.crearRegistro(registro.documento)
    .subscribe(data => {
      registro.documento = data;
    });
  }
}
