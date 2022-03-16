import { Component, OnInit } from '@angular/core';
import { ServiceService} from '../service.service'
import { User } from '../User';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private service:ServiceService) { }
  user:User
  ngOnInit(): void {

    this.user=this.service.getUser();
  }

}
