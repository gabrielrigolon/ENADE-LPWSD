import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class QuestaoService extends BaseService  {

  private urlQuestao: string;
  
  constructor(http: HttpClient) {
    super(http);
    this.urlQuestao = environment.urlAPI + 'Questao';
  }
  
  public getAllQuestao(): Observable<any> {
    return this.get(`${this.urlQuestao}`);
  }
  
  public getById(id: number): Observable<any> {
    return this.get(`${this.urlQuestao}/${id}`);
  }

  public getByUser(username: string): Observable<any> {
    return this.get(`${this.urlQuestao}/${username}`);
  }
  
  public createQuestao(forntP: any) {
    return this.post(`${this.urlQuestao}/CreateQuestao`, forntP);
  }
}