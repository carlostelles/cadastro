import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {ApiService} from './shared/api/api.service';
import {AuthService} from './shared/auth/auth.service';
import {AuthGuard} from './shared/auth/auth-guard.service';
import {FormsModule} from '@angular/forms';
import {AppRoutingModule} from './app-routing.module';
import {FullLayoutComponent} from './layouts/full/full-layout.component';
import {HttpClientModule} from '@angular/common/http';
import {PessoaService} from './shared/pessoa/pessoa.service';
import {ContentLayoutComponent} from './layouts/content/content-layout.component';
import {UtilsService} from './shared/api/utils.service';

@NgModule({
  declarations: [
    AppComponent,
    FullLayoutComponent,
    ContentLayoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    ApiService,
    AuthService,
    AuthGuard,
    PessoaService,
    UtilsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
