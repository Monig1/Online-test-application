import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { Questionmodel } from '../questionmodel';
import { Router } from '@angular/router';

@Component({
  selector: 'app-start-quiz',
  templateUrl: './start-quiz.component.html',
  styleUrls: ['./start-quiz.component.css']
})
export class StartQuizComponent implements OnInit {
  private questionsList:Questionmodel[];
  constructor(private service:QuestionService ,private router : Router) { }

  
  ngOnInit() {
    this.service.startQuiz().subscribe(res=>{
      this.questionsList=res});
  }

  startQuiz(){
    this.service.evaluate(this.questionsList).subscribe(res=>this.gotoreview(res));
  }
  gotoreview(res){
    this.router.navigate(['/review'],{ queryParams: { score: res, data:JSON.stringify(this.questionsList)} });
  }

}
