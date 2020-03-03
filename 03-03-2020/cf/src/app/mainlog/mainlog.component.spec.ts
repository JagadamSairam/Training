import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MainlogComponent } from './mainlog.component';

describe('MainlogComponent', () => {
  let component: MainlogComponent;
  let fixture: ComponentFixture<MainlogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MainlogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MainlogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
