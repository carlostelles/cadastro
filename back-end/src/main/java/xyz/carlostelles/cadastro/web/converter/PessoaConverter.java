package xyz.carlostelles.cadastro.web.converter;

import org.springframework.stereotype.Component;

import xyz.carlostelles.cadastro.business.data.PessoaTipo;
import xyz.carlostelles.cadastro.business.data.Ufs;
import xyz.carlostelles.cadastro.persistence.Pessoa;
import xyz.carlostelles.cadastro.web.domain.PessoaViewBean;

@Component
public class PessoaConverter extends Converter<Pessoa, PessoaViewBean> {

    public PessoaViewBean encode(Pessoa entity) {
        PessoaViewBean viewBean = new PessoaViewBean();
        viewBean.setId(entity.getId());
        viewBean.setNome(entity.getNome());
        viewBean.setDataNascimento(entity.getDataNascimento());
        viewBean.setTipo(PessoaTipo.valueOf(entity.getTipo()));
        viewBean.setUf(Ufs.valueOf(entity.getUf()));
        viewBean.setCidade(entity.getCidade());

        return viewBean;
    }

    public Pessoa decode(PessoaViewBean viewBean) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(viewBean.getId());
        pessoa.setNome(viewBean.getNome());
        pessoa.setDataNascimento(viewBean.getDataNascimento());
        pessoa.setTipo(viewBean.getTipo().getCode());
        pessoa.setUf(viewBean.getUf().getSigla());
        pessoa.setCidade(viewBean.getCidade());

        return pessoa;
    }
}
