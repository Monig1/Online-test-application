import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StartQuizComponent } from './start-quiz/start-quiz.component';
import { ReviewComponent } from './review/review.component';
import { ResultComponent } from './result/result.component';



const routes: Routes = [
  {path:'startQuiz',component:StartQuizComponent},
  {path:'result',component:ResultComponent},
  {path:'review',component:ReviewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
