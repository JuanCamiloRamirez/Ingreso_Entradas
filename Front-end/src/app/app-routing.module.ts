import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListarComponent } from './Registro/Listar/listar.component';
import { CrearComponent } from './Registro/Crear/crear.component';
import { ListarPersonaComponent } from './Model/Persona/crud-persona/listar-persona.component';


const routes: Routes = [
  {path: 'listar', component: ListarComponent},
  {path: 'crear', component: CrearComponent},
  {path: 'listar-persona', component: ListarPersonaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
