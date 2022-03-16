import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductService } from './product.service';
import { ChangeColorDirective } from './ChangeColorDirective';
import { HighlightDirective } from './HighlightDirective';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustomPipe } from './CustomPipe';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ProductlistComponent,
    ChangeColorDirective,
    HighlightDirective,
    SwitchdemoComponent,
    PipesComponent,
    CustomPipe
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
/*
import { ChangeColorDirective } from './ChangeColorDirective';
import { HighLightDirective } from './HighLightDirective';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustomPipe } from './CustomPipe';
HighLightDirective,
    SwitchdemoComponent,
    PipesComponent,
    CustomPipe*/