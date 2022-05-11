import { Component, OnInit } from '@angular/core';
import {Form} from '../form'
import { FormService } from '../form.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-list',
  templateUrl: './form-list.component.html',
  styleUrls: ['./form-list.component.css']
})
export class FormListComponent implements OnInit {

  forms: Form[];

  constructor(private formService: FormService, private router: Router) { }

  ngOnInit(): void {
    this.getForms();
  }

  private getForms(){
    this.formService.getFormsList().subscribe(data => {
      this.forms = data;
    });
    console.log(this.forms);
  }

  formDetails(id: number){
    this.router.navigate(['form-details', id]);
  }

}
