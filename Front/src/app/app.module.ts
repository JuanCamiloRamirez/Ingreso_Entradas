import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistroService } from './Service/Registro/registro.service';
import { PersonaService } from './Service/Persona/persona.service';

import {NgxPaginationModule} from 'ngx-pagination';
import { ListarRegistroComponent } from './Registro/Listar/listar-registro.component';
import { CrearRegistroComponent } from './Registro/Crear/crear-registro.component';
import { ListarPersonaComponent } from './Persona/listar-persona.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarRegistroComponent,
    CrearRegistroComponent,
    ListarPersonaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgxPaginationModule
  ],
  providers: [
    RegistroService,
    PersonaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
