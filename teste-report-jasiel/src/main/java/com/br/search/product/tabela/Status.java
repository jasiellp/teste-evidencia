package com.br.search.product.tabela;

public class Status
{
	
	public int getId()
	{
		return id;
	}


	public String getNome()
	{
		return nome;
	}


	public String getDescricao()
	{
		return descricao;
	}


	private int id;
	private String nome,descricao;
	
	
	public Status(int id, String nome, String descricao)
	{
		this.id=id;
		this.nome=nome;
		this.descricao=descricao;
	}
	
	
	
	
	
}
