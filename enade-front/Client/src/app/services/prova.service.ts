import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class ProvaService extends BaseService  {

  private urlProva: string;
  
  constructor(http: HttpClient) {
    super(http);
    this.urlProva = environment.urlAPI + 'Prova';
  }
  
  public getAllProvas(): Observable<any> {
    return this.get(`${this.urlProva}`);
  }
  
  public getById(id: number): Observable<any> {
    return this.get(`${this.urlProva}/${id}`);
  }
  
  public createProva(prova: any) {
    return this.post(`${this.urlProva}/CreateProva`, prova);
  }

}