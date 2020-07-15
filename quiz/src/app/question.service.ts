import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Questionmodel } from './questionmodel';
import { Attempt } from './attempt';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private url:string;
  constructor(private http:HttpClient) { 
    this.url="http://localhost:4002/"
  }

  public startQuiz():Observable<Questionmodel[]>{
    return this.http.get<Questionmodel[]>(this.url+"questions");
  }
  public evaluate(questions:Questionmodel[]):Observable<number>{
    return this.http.post<number>(this.url+"evaluate",questions);

  }
  public getResults():Observable<Attempt[]>{
    return this.http.get<Attempt[]>(this.url+"attempts");
  }
 
}
