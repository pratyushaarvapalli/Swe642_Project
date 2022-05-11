import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormListComponent } from './form-list/form-list.component';
import { SubmitFormComponent } from './submit-form/submit-form.component';
import { FormDetailsComponent } from './form-details/form-details.component';
import { WelcomeTabComponent } from './welcome-tab/welcome-tab.component';

const routes: Routes = [
  {path: 'welcome-tab', component: WelcomeTabComponent},
  {path: 'forms', component: FormListComponent},
  {path: 'submit-form', component: SubmitFormComponent},
  {path: '', redirectTo: 'welcome-tab', pathMatch: 'full'}, 
  {path: 'form-details/:id', component: FormDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
