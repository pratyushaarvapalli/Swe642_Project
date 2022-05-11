import { Component, OnInit } from '@angular/core';
import { Form } from '../form';
import { ActivatedRoute, Router } from '@angular/router';
import { FormService } from '../form.service';

@Component({
  selector: 'app-form-details',
  templateUrl: './form-details.component.html',
  styleUrls: ['./form-details.component.css']
})
export class FormDetailsComponent implements OnInit {

  id: number
  form: Form
  constructor(private route: ActivatedRoute, private formService: FormService,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.form = new Form();
    this.formService.getFormById(this.id).subscribe( data => {
      this.form = data;
    });
  }

  backToList(){
    this.router.navigate(['forms']);
  }

}
