import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class ResultadoService extends BaseService  {

  private urlResultado: string;
  
  constructor(http: HttpClient) {
    super(http);
    this.urlResultado = environment.urlAPI + 'Resultado';
  }
  
  public getAllResultado(): Observable<any> {
    return this.get(`${this.urlResultado}`);
  }
  
  public getById(id: number): Observable<any> {
    return this.get(`${this.urlResultado}/${id}`);
  }

  public getResultByUser(username: string): Observable<any> {
    return this.get(`${this.urlResultado}/${username}`);
  }
  
  public createResultado(forntP: any) {
    return this.post(`${this.urlResultado}/CreateResultado`, forntP);
  }
}
