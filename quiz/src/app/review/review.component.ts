import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Questionmodel } from '../questionmodel';
import { QuestionService } from '../question.service';


@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  private score:number;
  private questionsList:Questionmodel[];
  private questionsList1:Questionmodel[];
  private data:string;
  constructor(private route: ActivatedRoute,private service:QuestionService) {
    this.route.queryParams.subscribe(params => {
      this.score = params["score"];
      this.data=params["data"];
      this.questionsList=JSON.parse(this.data);
     
  });
   }

  ngOnInit() {
      
  }

}
