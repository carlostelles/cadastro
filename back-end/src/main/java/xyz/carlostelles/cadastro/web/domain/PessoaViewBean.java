package xyz.carlostelles.cadastro.web.domain;

import java.time.LocalDate;

import xyz.carlostelles.cadastro.business.data.PessoaTipo;
import xyz.carlostelles.cadastro.business.data.Ufs;

public class PessoaViewBean {
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private PessoaTipo tipo;
	private Ufs uf;
	private String cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public PessoaTipo getTipo() {
		return tipo;
	}

	public void setTipo(PessoaTipo tipo) {
		this.tipo = tipo;
	}

	public Ufs getUf() {
		return uf;
	}

	public void setUf(Ufs uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
