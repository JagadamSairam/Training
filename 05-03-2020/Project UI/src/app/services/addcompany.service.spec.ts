import { TestBed } from '@angular/core/testing';

import { AddcompanyService } from './addcompany.service';

describe('AddcompanyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddcompanyService = TestBed.get(AddcompanyService);
    expect(service).toBeTruthy();
  });
});
