import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/models/usuario.model';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-usuario-create',
  templateUrl: './usuario-create.component.html',
  styleUrls: ['./usuario-create.component.css']
})
export class UsuarioCreateComponent implements OnInit {

  usuario: Usuario = new Usuario();
  usuarioValidacao: any;

  submitted = false;

  constructor(
    private UsuarioService: UsuarioService,
    private router: Router ) { }

  ngOnInit() {
  }

  newUsuario(): void {
    this.submitted = false;
    this.usuario = new Usuario();
  }

  save() {
    this.UsuarioService.createUsuario(this.usuario)
      .subscribe(data => {
        console.log(data),
          this.usuario = new Usuario();
        this.gotoList();
      }, error => console.log(error));

  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }
  gotoList() {
    this.router.navigate(['/usuarioList']);
  }
}
