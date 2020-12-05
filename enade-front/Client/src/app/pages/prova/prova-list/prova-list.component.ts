import { Component, OnInit } from '@angular/core';
import { Prova } from 'src/app/models/prova.model';
import { ProvaService } from 'src/app/services/prova.service';

@Component({
  selector: 'app-prova-list',
  templateUrl: './prova-list.component.html',
  styleUrls: ['./prova-list.component.css']
})
export class ProvaListComponent implements OnInit {

  provas: Prova[] = []
  
  constructor(
    private provaService: ProvaService
  ) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.provaService.getAllProvas().subscribe(response => {
      this.provas = response;
    });
  }

}
