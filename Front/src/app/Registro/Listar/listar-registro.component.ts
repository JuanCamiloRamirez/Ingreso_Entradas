import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Registro } from '../../Model/Registro/registro';
import { RegistroService } from '../../Service/Registro/registro.service';

@Component({
  selector: 'app-listar-registro',
  templateUrl: './listar-registro.component.html',
  styleUrls: ['./listar-registro.component.css']
})
export class ListarRegistroComponent implements OnInit {

  pageActual = 1;
  registros: Registro[];

  constructor(private service: RegistroService  , private router: Router) { }

  ngOnInit(): void {
    this.service.getRegistros().subscribe(data => {
      this.registros = data;
    });
  }

}
