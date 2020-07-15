import { Component, OnInit } from '@angular/core';
import { Attempt } from '../attempt';
import { QuestionService } from '../question.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
  private attemptList:Attempt[];
  constructor(private service:QuestionService ,private router : Router) { }

  ngOnInit() {
    this.service.getResults().subscribe(res=>{
      this.attemptList=res});
  }
}
