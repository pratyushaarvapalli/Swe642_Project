import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormListComponent } from './form-list/form-list.component';
import { SubmitFormComponent } from './submit-form/submit-form.component';
import { FormsModule } from '@angular/forms';
import { FormDetailsComponent } from './form-details/form-details.component';
import { WelcomeTabComponent } from './welcome-tab/welcome-tab.component';

@NgModule({
  declarations: [
    AppComponent,
    FormListComponent,
    SubmitFormComponent,
    FormDetailsComponent,
    WelcomeTabComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
