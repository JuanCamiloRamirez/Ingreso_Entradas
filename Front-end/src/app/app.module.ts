import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Registro/Listar/listar.component';
import { RegistroService } from './Service/Registro/registro.service';
import { CrearComponent } from './Registro/Crear/crear.component';
import { PersonaService } from './Service/Persona/persona.service';
import { ListarPersonaComponent } from './Model/Persona/crud-persona/listar-persona.component';

import {NgxPaginationModule} from 'ngx-pagination';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    CrearComponent,
    ListarPersonaComponent,
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
