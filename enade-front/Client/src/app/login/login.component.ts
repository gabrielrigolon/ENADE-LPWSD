import { Component, OnInit } from '@angular/core';
import { Usuario } from '../models/usuario.model';
import { UsuarioCreateComponent } from '../pages/usuario/usuario-create/usuario-create.component';
import { UsuarioService } from '../services/usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})



export class LoginComponent implements OnInit {
  
  usuario: Usuario = new Usuario();
  valido: boolean;
  usuarioValidacao: any;
  
  constructor(
    private usuarioService: UsuarioService
    
    ) { }

  ngOnInit() {
  }

  logar() {
    this.usuarioService.getByUser(this.usuario.name)
    .subscribe(data => {
      this.usuarioValidacao = data;
      if(this.usuarioValidacao.user == this.usuario.user && this.usuarioValidacao.password == this.usuario.password) {
        this.valido == true
      }
    }, error => { 
      console.log(error)
    });
  }

}
