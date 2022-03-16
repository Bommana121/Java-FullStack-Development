import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { ServiceService} from '../service.service'
import { User } from '../User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm:FormGroup;
  submitted:boolean=false;
  constructor(private builder:FormBuilder,private service:ServiceService, private router:Router) { }

  userData:User=new User()
  ngOnInit(): void {

    this.registerForm= this.builder.group({
      name:["",Validators.required],
      address:["",Validators.required],
      email:["",[Validators.required,Validators.email]],
      qualification:["",[Validators.required]],
      age:["",[Validators.required]]
    })
  }
  get f()
  {
    return this.registerForm.controls;
  }
  onSubmit()
  {
      this.submitted=true;

      if(this.registerForm.invalid)
        return;
      else
       
        this.service.setUser(this.userData);

        this.router.navigateByUrl('profile')
  }
  

}
