import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Form } from './form';

@Injectable({
  providedIn: 'root'
})
export class FormService {


  private baseUrl = "http://localhost:8080/api/v1/forms";

  constructor(private httpClient: HttpClient) { }

  getFormsList(): Observable<Form[]>{
    return this.httpClient.get<Form[]>(`${this.baseUrl}`);
  }

  submitForm(form: Form): Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`, form);
  }

  getFormById(id: number): Observable<Form>{
    return this.httpClient.get<Form>(`${this.baseUrl}/${id}`);
  }
}
