import { TestBed } from '@angular/core/testing';

import { CompareserviceService } from './compareservice.service';

describe('CompareserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CompareserviceService = TestBed.get(CompareserviceService);
    expect(service).toBeTruthy();
  });
});
