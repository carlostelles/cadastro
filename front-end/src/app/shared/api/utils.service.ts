import {Injectable} from '@angular/core';
import {ApiService} from './api.service';

@Injectable()
export class UtilsService {
  ufsData: Array<any>;
  tipoPesoaData: Array<any>;

  constructor(private api: ApiService) {
  }

  getUfsData(): Array<any> {
    return this.ufsData;
  }

  getTipoPessoaData(): Array<any> {
    return this.tipoPesoaData;
  }

  getUfs(): Promise<Array<any>> {
    let promise: Promise<Array<any>>;

    promise = new Promise((resolve) => {
      this.api.get('utils/ufs')
        .toPromise()
        .then(
          res => { // Success
            this.ufsData = [];
            this.ufsData = Array.prototype.slice.call(res);
            resolve();
          }
        );
    });
    return promise;
  }

  getTipoPessoa(): Promise<Array<any>> {
    let promise: Promise<Array<any>>;

    promise = new Promise((resolve) => {
      this.api.get('utils/pessoa-tipo')
        .toPromise()
        .then(
          res => { // Success
            this.tipoPesoaData = [];
            this.tipoPesoaData = Array.prototype.slice.call(res);
            resolve();
          }
        );
    });
    return promise;
  }
}
