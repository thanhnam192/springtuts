import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-boostrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  salesPersonList : SalesPerson[]  = [
    new SalesPerson("nam", "nguyen", "nam@gmail.com", 50000),
    new SalesPerson("duyen", "ngoc", "duyen@gmail.com", 60000),
    new SalesPerson("Kim", "Thien", "Kim@gmail.com", 70000),
    new SalesPerson("Dat", "Map", "Dat@gmail.com", 40000),
  ];

  constructor() { }

  ngOnInit() {
  }

}
