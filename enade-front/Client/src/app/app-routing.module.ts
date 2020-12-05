import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProvaCreateComponent } from './pages/prova/prova-create/prova-create.component';
import { ProvaListComponent } from './pages/prova/prova-list/prova-list.component';
import { ResultadoCreateComponent } from './pages/resultado/resultado-create/resultado-create.component';
import { ResultadoListComponent } from './pages/resultado/resultado-list/resultado-list.component';
import { UsuarioCreateComponent } from './pages/usuario/usuario-create/usuario-create.component';
import { UsuarioListComponent } from './pages/usuario/usuario-list/usuario-list.component';


const routes: Routes = [
  { path: 'usuarioList', component: UsuarioListComponent },
  { path: 'usuarioCreate', component: UsuarioCreateComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'provaList', component: ProvaListComponent },
  { path: 'provaCreate', component: ProvaCreateComponent },
  { path: 'login', component: LoginComponent },
  { path: 'resultadoList', component: ResultadoListComponent},
  { path: 'resultadoCreate', component:ResultadoCreateComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
