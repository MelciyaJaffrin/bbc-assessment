import { TestBed } from '@angular/core/testing';

import { AddCustomersService } from './add-customers.service';

describe('AddCustomersService', () => {
  let service: AddCustomersService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddCustomersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
