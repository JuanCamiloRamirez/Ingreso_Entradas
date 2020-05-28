import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarPersonaComponent } from './Persona/listar-persona.component';
import { CrearRegistroComponent } from './Registro/Crear/crear-registro.component';
import { ListarRegistroComponent } from './Registro/Listar/listar-registro.component';


const routes: Routes = [
  {path: 'listar-persona', component: ListarPersonaComponent},
  {path: 'crear-registro', component: CrearRegistroComponent},
  {path: 'listar-registro', component: ListarRegistroComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
