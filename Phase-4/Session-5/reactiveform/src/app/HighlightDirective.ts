import { Directive, ElementRef, Renderer2 } from "@angular/core";

@Directive({
    selector:'[highlight]' //directive selector
})
export class HighlightDirective{

    constructor(elemref:ElementRef,render:Renderer2)
    {
        render.setStyle(elemref.nativeElement,'background-color','green');
    }
}
