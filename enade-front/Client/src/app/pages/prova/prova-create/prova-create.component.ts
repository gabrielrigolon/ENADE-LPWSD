import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Prova } from 'src/app/models/prova.model';
import { ProvaService } from 'src/app/services/prova.service';

@Component({
  selector: 'app-prova-create',
  templateUrl: './prova-create.component.html',
  styleUrls: ['./prova-create.component.css']
})
export class ProvaCreateComponent implements OnInit {

  //frontP: FrontParams = new FrontParams();

  submitted = false;
  prova: Prova = new Prova();


  constructor(
    private provaService: ProvaService,
    private router: Router) { }

  ngOnInit() {
  }

  newProva(): void {
    this.submitted = false;
    //this.frontP = new FrontParams();
  }

  save() {
    this.provaService.createProva(this.prova)
      .subscribe(data => {
          this.prova = new Prova();
        this.gotoList();
      }, error => console.log(error));

  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }
  gotoList() {
    this.router.navigate(['/provaList']);
  }

}
