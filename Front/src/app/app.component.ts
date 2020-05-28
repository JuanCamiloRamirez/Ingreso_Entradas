import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'front-end-Ingresos-Entradas';

  constructor(private router: Router){}
    ListarRegistros(){
      this.router.navigate(["listar-registro"]);
    }

    CrearRegistro(){
      this.router.navigate(["crear-registro"]);
    }

    ListarPersonas(){
      this.router.navigate(["listar-persona"]);
    }
}
