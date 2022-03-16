import { outputAst } from '@angular/compiler';
import { Component,  EventEmitter,   OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs:['pdata'],
  outputs:['cevent']
})
export class ChildComponent implements OnInit {

 pdata:string=""
  constructor() { }

  ngOnInit(): void {
  }
  
  cevent=new EventEmitter<string>()
  call(value:string){
    this.cevent.emit(value)
  }

  
}