import { Injectable } from '@angular/core';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor() {  }
  user:User

  setUser(u:User){
    this.user=u
  }
  getUser():User
  {
    return this.user
  }

}
