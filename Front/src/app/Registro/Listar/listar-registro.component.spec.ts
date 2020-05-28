import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarRegistroComponent } from './listar-registro.component';

describe('ListarRegistroComponent', () => {
  let component: ListarRegistroComponent;
  let fixture: ComponentFixture<ListarRegistroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarRegistroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarRegistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
