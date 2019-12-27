import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
    selector : 'filter-textbox',
    template : `
        Filter: <input type="text" [(ngModel)]="filter" />
    `
})

export class FilterTextboxComponent implements OnInit{
    private _filter: string;
    @Output() changed : EventEmitter<string> = new EventEmitter<string>();

    @Input() get filter(): string {
        return this._filter;
    }
     set filter(value: string) {
        this._filter = value;
        this.changed.emit(this.filter);
    }


    constructor(){}

    ngOnInit(){}
}