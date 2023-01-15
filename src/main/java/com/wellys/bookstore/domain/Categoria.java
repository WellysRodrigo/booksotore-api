package com.wellys.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

	private Integer id;
	private String name;
	private String descricao;

	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
	}

	public Categoria(Integer id, String name, String descricao) {
		super();
		this.id = id;
		this.name = name;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Livro> getLivro() {
		return livros;
	}

	public void setLivro(List<Livro> livro) {
		this.livros = livro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

}
