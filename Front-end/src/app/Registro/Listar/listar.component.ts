import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { RegistroService } from '../../Service/Registro/registro.service';
import { Registro } from 'src/app/Model/registro';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  registros: Registro[];

  constructor(private service: RegistroService  , private router: Router) { }

  ngOnInit(): void {
    this.service.getRegistros().subscribe(data => {
      this.registros = data;
    });
  }
}
