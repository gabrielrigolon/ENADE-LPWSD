import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService extends BaseService  {

  private urlUsuario: string;
  
  constructor(http: HttpClient) {
    super(http);
    this.urlUsuario = environment.urlAPI + 'Usuario';
  }
  
  public getAllUsuario(): Observable<any> {
    return this.get(`${this.urlUsuario}`);
  }
  
  public getById(id: number): Observable<any> {
    return this.get(`${this.urlUsuario}/${id}`);
  }

  public getByUser(username: string): Observable<any> {
    return this.get(`${this.urlUsuario}/${username}`);
  }
  
  public createUsuario(forntP: any) {
    return this.post(`${this.urlUsuario}/CreateUsuario`, forntP);
  }
}
