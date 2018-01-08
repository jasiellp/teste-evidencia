package com.br.search.product.tabela;

public class Perfil
{
	
	public int getId()
	{
		return id;
	}

	public String getNomePerfil()
	{
		return nomePerfil;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public String getResultado()
	{
		return resultado;
	}

	private int id;
	private String nomePerfil,
	               descricao,
	               resultado;
	
	public Perfil(int id,String nomePerfil, String descricao, String resultado)
	{
		 this.id=id;
		 this.nomePerfil=nomePerfil;
		 this.descricao=descricao;
		 this.resultado=resultado;
	}

}
