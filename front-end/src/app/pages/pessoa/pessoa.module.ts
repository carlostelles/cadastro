import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';

import {PessoaRoutingModule} from './pessoa-routing.module';

import {PessoaSearchComponent} from './search/pessoa.search.component';
import {PessoaDetailComponent} from './detail/pessoa.detail.component';

@NgModule({
  exports: [
  ],
  imports: [
    CommonModule,
    PessoaRoutingModule,
    FormsModule
  ],
  declarations: [
    PessoaSearchComponent,
    PessoaDetailComponent
  ]
})
export class PessoaModule { }
